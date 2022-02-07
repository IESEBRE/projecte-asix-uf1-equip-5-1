package codi;

import java.util.Random;

import static codi.Main.entrada;
import static codi.Main.mostrar;

public class Animal {
    void Animal() {
    }

    String talking() {
        boolean ordre[];
        ordre = new boolean[7];
        String animalfinal = "";
        String nomguardar = "";
        char caracterfinal = ' ';
        int cout = 0;
        String obci;
        String conveses = "";
        String esport = "";
        char VLetra;
        char entradalletra1;

        while (true) {

            System.out.println("");
            int pregunta;
            String Tipo;


            if (mostrar) System.out.println("Selecciona quina pregunta vols:");
            if (mostrar) System.out.println("1.Quin tipus d’animal ets?");
            if (mostrar) System.out.println("2.A que t’agrada jugar? ");
            if (mostrar) System.out.println("3.Quin es el teu caracter favorit?");
            if (mostrar)
                System.out.println("4.Sabries llista tots els caràcters amb valor Unicode parell i menors o iguals a Z resultants\n" +
                        "de la suma, entre el valor Unicode del primer i segon caracter, on el valor Unicode del\n" +
                        "primer creixerà fins al segon, el segon decreixera fins primer ? ");
            if (mostrar) System.out.println("5.Juguem a fer onomatopeies? ");
            if (mostrar) System.out.println("6.Posa-li un nom:");
            if (mostrar) System.out.println("7.Pots recordar-me la nostra conversa?");
            if (mostrar) System.out.println("8.Sortida");

            pregunta = entrada.nextInt();
            switch (pregunta) {
                case 1:
                    if (mostrar) System.out.println("Defineix quin tipus d'animal ets:");
                    char animal = entrada.next().charAt(0);
                    int difG = 'g' - animal;
                    int difS = 's' - animal;

                    //Definim els condiconals en funcion a la posició numerica en valor Unicode dels caracters alfanumerics.
                    if (difG >= -3 || animal <= 'g') {
                        System.out.println("Gos");
                        animalfinal = "gos";
                        conveses += ("Gos" + "\n");

                    } else if (difS <= -3 || animal >= 's') {
                        System.out.println("Serp");
                        animalfinal = "serp";
                        conveses += ("Serp" + "\n");
                    } else {
                        System.out.println("Mono");
                        animalfinal = "mono";
                        conveses += ("Mono" + "\n");
                    }
                    System.out.println("No esta amb " + animal + ", el mes proxim es " + animalfinal);
                    conveses += ("No esta amb " + animal + ", el mes proxim es " + animalfinal);
                    ordre[0] = true;
                    break;

                case 2:
                    if (ordre[0] && ordre[1] == false) {
                        if (mostrar) System.out.println("A que t'agrada jugar? ");
                        VLetra = entrada.next().charAt(0);

                        if (VLetra==('A')) {
                            System.out.println("Pilla-pilla");
                            esport = "pilla-pilla";
                        }
                        if (VLetra==('B')) {
                            System.out.println("Pilota");
                            esport = "pilota";
                        }
                        if (VLetra==('C')) {
                            System.out.println("Saltar");
                            esport = "saltar";
                        }
                        if (VLetra==('D')) {
                            System.out.println("Circuit");
                            esport = "circuit";
                        }
                        if (VLetra==('E')) {
                            System.out.println("Correr");
                            esport = "correr";
                        }
                        if (VLetra==('F')) {
                            System.out.println("Dinamica");
                            esport = "dinamica";
                        }
                        if (VLetra==('G')) {
                            System.out.println("Vols");
                            esport = "vols";
                        }
                        if (VLetra==('H')) {
                            System.out.println("Amagar");
                            esport = "amagar";
                        }
                        if (VLetra==('I')) {
                            System.out.println("Cercar");
                            esport = "cercar";
                        }
                        if (VLetra==('J')) {
                            System.out.println("Estirar");
                            esport = "estirar";
                        }
                        conveses += esport + "\n";
                        ordre[1] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");

                    }
                    break;
                case 3:
                    if (ordre[1] && ordre[2] == false) {
                        char Caracter;
                        char impresio = 'A';
                        if (mostrar) System.out.println("Quin es el teu caracter favorit?");

                        Caracter = entrada.next().charAt(0);
                        char contador = (char) ((Caracter - 'A') / 2);
                        caracterfinal = (char) (contador + 'A');

                        while (impresio != (char) (contador + 'A')) {
                            System.out.print(impresio + " ");
                            conveses += (impresio + " ");
                            ++impresio;

                        }
                        System.out.printf(String.valueOf("...He triat el " + caracterfinal + "!"));
                        conveses += ("...He triat el " + caracterfinal + "!") + "\n";
                        ordre[2] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 4:
                    if (ordre[2] && ordre[3] == false) {
                        char lletra1, lletra2;
                        if (mostrar)System.out.println("Disme una lletra de la A a la Z");

                        lletra1 = entrada.next().charAt(0);
                        if (mostrar)System.out.println("Disme una segona lletra més gran que l'anterior dins del rang de la A a la Z");

                        lletra2 = entrada.next().charAt(0);

                        if ((((lletra1 - 'A') + (lletra2 - 'A') + 'A') % 2 == 0) && (((lletra1 - 'A') + (lletra2 - 'A') + 'A') <= 'Z')) {
                            for (int contador1 = lletra1; contador1 < lletra2; contador1++) {
                                System.out.printf((char) (contador1) + "   ");
                                conveses += String.format((char) (contador1) + "   ");
                                for (int contador2 = lletra2; contador2 > contador1; contador2--) {
                                    System.out.printf((char) (contador2) + "   ");
                                    conveses += String.format((char) (contador2) + "   ");
                                }
                                System.out.println();
                                conveses += "\n";
                            }
                        }

                        ordre[3] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");

                        break;
                    }
                case 5:
                    if (mostrar) {
                        if (ordre[3] && ordre[4] == false) {

                            Random r = new Random();
                            if (mostrar) System.out.println("Tria un caracter per formar una onomatopeia: ");

                            int numloop = 0;
                            while (numloop != 10) {

                                char variable1 = entrada.next().charAt(0);
                                System.out.println("TU:" + variable1);
                                char variable2 = (char) (r.nextInt(26) + 'a');
                                System.out.println("ELL: " + variable2);
                                char variable3 = entrada.next().charAt(0);
                                System.out.println("TU: " + variable3);
                                ++numloop;
                                String str = new StringBuilder().append(variable1).append(variable2).append(variable3).toString();
                                char vocal = str.charAt(1);

                                if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                                    System.out.println("La combinació " + str + " es una onomatopeia");
                                    conveses+=("La combinació " + str + " es una onomatopeia"+"\n");
                                    cout++;
                                } else {
                                    System.out.println("La combinació " + str + " no es una onomatopeia");
                                    conveses+=("La combinació " + str + " no es una onomatopeia"+"\n");
                                    cout++;
                                }
                            }
                            ordre[4] = true;
                            break;
                        } else {
                            System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                            break;
                        }
                    } else {
                        System.out.println("No es pot jugar en mode JOEL!!");
                        conveses+=("No es pot jugar en mode JOEL!!"+"\n");
                        ordre[4] = true;
                    }
                    break;
                case 6:
                    if (ordre[4] && ordre[5] == false) {
                        if (mostrar) System.out.println("Dona'm un nom");

                        nomguardar = entrada.nextLine();
                        nomguardar = entrada.nextLine();
                        System.out.println("Gracies, m'agrada molt el nom de " + nomguardar);
                        conveses += ("Gracies, m'agrada molt el nom de " + nomguardar);
                        ordre[5] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 7:
                    if (ordre[5] && ordre[6] == false) {
                        System.out.println("Em dic " + nomguardar + " i soc un " + animalfinal + ". El meu joc favorit es " + esport + ". El meu caracter favorit es el  " + caracterfinal + ".");
                        conveses += ("Em dic " + nomguardar + " i soc un " + animalfinal + ". El meu joc favorit es " + esport + ". El meu caracter favorit es el  " + caracterfinal + "." + "\n");
                        if (mostrar){
                            System.out.println("has fet "+cout+"onomatopeies" );
                            conveses+=("has fet "+cout+"onomatopeies"+"\n" );
                        }
                        ordre[6] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                case 8:
                    if (ordre[6] == true) {
                        return conveses;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
            }
        }
