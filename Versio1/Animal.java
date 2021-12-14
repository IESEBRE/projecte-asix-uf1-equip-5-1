package codi;

import java.util.Random;
import java.util.Scanner;

import static codi.Main.mostrar;
import static codi.Main.entrada;
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
        String conveses="";
        while (true) {

            System.out.println("");
            byte pregunta;
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

            pregunta = entrada.nextByte();
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

                    } else if (difS <= -3 || animal >= 's') {
                        System.out.println("Serp");
                        animalfinal = "serp";
                    } else {
                        System.out.println("Mono");
                        animalfinal = "gos";
                    }
                    ordre[0] = true;
                    break;

                case 2:
                    if (ordre[0] && ordre[1]==false) {
                        String VLetra;
                        if (mostrar) System.out.println("A que t'agrada jugar?");

                        VLetra = entrada.nextLine();
                        if (VLetra.equals("A")) {
                            System.out.println("Atletisme");
                        } else if (VLetra.equals("B")) {
                            System.out.println("Boxeig");
                        } else if (VLetra.equals("C")) {
                            System.out.println("Ciclisme");
                        } else if (VLetra.equals("D")) {
                            System.out.println("Dansa");
                        } else if (VLetra.equals("E")) {
                            System.out.println("Esgrima");
                        } else if (VLetra.equals("F")) {
                            System.out.println("Futbol");
                        } else if (VLetra.equals("G")) {
                            System.out.println("Golf");
                        } else if (VLetra.equals("H")) {
                            System.out.println("Handbol");
                        } else if (VLetra.equals("I")) {
                            System.out.println("Indiaca");
                        } else if (VLetra.equals("J")) {
                            System.out.println("Judo");
                        }
                        ordre[1] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 3:
                    if (ordre[1] && ordre[2]==false) {
                        char Caracter;
                        char impresio = 'A';
                        if (mostrar) System.out.println("Quin es el teu caracter favorit?");

                        Caracter = entrada.next().charAt(0);
                        char contador = (char) ((Caracter - 'A') / 2);
                        caracterfinal = (char) (contador + 'A');

                        while (impresio != (char) (contador + 'A')) {
                            System.out.print(impresio + ",");
                            ++impresio;
                        }
                        System.out.printf(String.valueOf("el caracter que has elegit és " + caracterfinal + ","));
                        ordre[2] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 4:
                    if (ordre[2] && ordre[3]==false) {
                        ordre[3] = true;
                        break;

                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");

                        break;
                    }
                case 5:
                    if (mostrar) {
                        if (ordre[3]&& ordre[4]==false) {

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
                                    cout++;
                                } else {
                                    System.out.println("La combinació " + str + " no es una onomatopeia");
                                    cout++;
                                }
                            }
                            ordre[4]=true;
                            break;
                        }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                            break;}
                    }else {System.out.println("No es pot jugar en mode JOEL!!");
                        ordre[4]=true;
                    }break;
                case 6:
                    if (ordre[4] && ordre[5]==false) {
                        if (mostrar) System.out.println("Dona'm un nom");

                        nomguardar = entrada.nextLine();
                        System.out.println("Gràcies,m'agrada aquest nom.");
                        ordre[5]=true;
                        break;
                    }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}
                case 7:
                    if (ordre[5] && ordre[6]==false) {
                        System.out.println("El meu nom es nom " + nomguardar + " soc un " + animalfinal + " el meu caràcter favorit es " + caracterfinal + " el total de onomatopeies es " + cout + ".");
                        ordre[6]=true;
                        break;
                    }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}

                case 8:
                    if (ordre[6] == true) {
                        return conveses;
                    }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}
            }
        }


    }
}
