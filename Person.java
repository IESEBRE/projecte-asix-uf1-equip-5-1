package codi;

import java.util.Random;

import static codi.Main.entrada;
import static codi.Main.mostrar;

public class Person {
    // Constructor
    void Person() {
    }

    String talking() {
        boolean ordre[];
        ordre = new boolean[7];
        if (mostrar)System.out.println("Hola, que tal!");
        if (mostrar)System.out.println("Tria una pregunta les has de respondre totes");

        //variables
        //escaners

        int pregunta;
        //nom
        String nom = "";
        //pedra paper tizora
        String jugada1;
        double jugada2;
        int puntuacio1 = 0;
        int puntuacio2 = 0;
        String win = "";

        //multiplicacions
        int a;
        int b;
        //tipusdepersona
        int num = 0;

        String sexe = "";

        //esport
        int esport;
        String tria = "";
        //nombre preferit
        int num1=1;
        int num2 =0;
        //sortida
        String obcio;
        //proces
        String conveses ="";
        while (true) {
            if (mostrar) System.out.println("1. Quin tipus de persona ets?");
            if (mostrar) System.out.println("2. Quin esport t’agrada?");
            if (mostrar)System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
            if (mostrar)System.out.println("4. Sabries llista tots els nombres parells resultants de la multiplicació, entre el valor enter de a i b, on el valor de a creixerà fins b, b decreixerà fins a ? ");
            if (mostrar)System.out.println("5. Juguem a pedra paper i tisora? ");
            if (mostrar)System.out.println("6. Posa-li un nom:");
            if (mostrar)System.out.println("7. Pots recordar-me la nostra conversa?");
            if (mostrar)System.out.println("8. Sortida de l’aplicació.");
            pregunta =Integer.parseInt(entrada.nextLine());
            switch (pregunta) {
                case 1:// 1


                    if (mostrar) System.out.println("Digues quin tipus persona soc amb un numero del 1 al 100");
                    num = Integer.parseInt(entrada.nextLine());
                    if (num % 2 == 0 && num % 3 == 0) {
                        System.out.println("No binari");
                        sexe = ("No binari");
                    } else {
                        if (num % 3 == 0) {
                            System.out.println("Dona");
                            sexe = ("Dona");
                        } else {
                            {
                                if (num % 2 == 0) System.out.println("Home");
                                sexe = ("Home");

                            }

                        }
                        conveses+=sexe +"\n";
                    }
                    ordre[0] = true;
                    break;
                case 2://2
                    if (ordre[0] && ordre[1]==false) {

                        if (mostrar) System.out.println("Digues un nombre del 1 al 10 aques sera el meu esport preferit");
                        esport = Integer.parseInt(entrada.nextLine());
                        if (esport == 1) {
                            System.out.println("Hoquei");
                            tria = ("hoquei");
                        }
                        if (esport == 2) {
                            System.out.println("Basquet");
                            tria = ("basquet");
                        }
                        if (esport == 3) {
                            System.out.println("Handbol");
                            tria = ("handbol");
                        }
                        if (esport == 4) {
                            System.out.println("Patinatge");
                            tria = ("patinatge");
                        }
                        if (esport == 5) {
                            System.out.println("Rugbi");
                            tria = ("rugbi");
                        }
                        if (esport == 6) {
                            System.out.println("Ritmica");
                            tria = ("ritmica");
                        }
                        if (esport == 7) {
                            System.out.println("Natacio");
                            tria = ("natacio");
                        }
                        if (esport == 8) {
                            System.out.println("Judo");
                            tria = ("judo");
                        }
                        if (esport == 9) {
                            System.out.println("Atletisme");
                            tria = ("atletisme");
                        }
                        if (esport == 10) {
                            System.out.println("Ciclisme");
                            tria = ("ciclisme");
                        }
                        conveses+=tria + "\n";
                        ordre[1] = true;
                        break;
                    } else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}

                case 3://3
                    if (ordre[1] && ordre[2]==false) {
                        if (mostrar)System.out.println("donam un rang");

                        num2 = Integer.parseInt(entrada.nextLine());
                        num2 = (num2 - (num2 - num1) / 2);
                        while (num2 > num1) {
                            System.out.print("" + (num1 -1)+ " ");
                            num1++;
                        }
                        System.out.println("...He triat el " + (num2-1) + "!");
                        conveses+=num2-1+ "\n";
                        ordre[2] = true;
                        break;
                    }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}
                case 4://4
                    if (ordre[2] && ordre[3]==false) {

                        if (mostrar) System.out.println("Quins dos nombres hem de multiplicar?");
                        a = Integer.parseInt(entrada.nextLine());
                        b = Integer.parseInt(entrada.nextLine());
                        for (int i = a; i <= b; i++) {
                            System.out.println();
                            conveses+="\n";
                            for (int j = b; j >= a; j--) {
                                if ((i * j) % 2 == 0){ System.out.print(i * j + "\t");
                                    conveses+= i * j + "\t";}
                            }

                        }System.out.println();
                        conveses+="\n";
                        //             System.out.println();
                        ordre[3] = true;
                        break;
                    }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}
                case 5://5

                    if (mostrar) {
                        if (ordre[3]&& ordre[4]==false) {

                            while (puntuacio1 < 5 || puntuacio2 < 5) {
                                if (mostrar) System.out.println("digues pedra ,paper o tisora una de les 3 ");
                                jugada1 = entrada.nextLine();
                                jugada2 = new Random().nextInt(3) + 1;
                                System.out.println(jugada2);
                                //1 es paper 2 es pedra 3 es tisores
                                if ((jugada1.equals("pedra") && jugada2 == 1) || (jugada1.equals("tisora") && jugada2 == 2) || (jugada1.equals("paper") && jugada2 == 3)) {
                                    puntuacio1++;
                                    System.out.println("Jugador1");
                                } else {
                                    if ((jugada2 == 2 && jugada1.equals("paper")) || (jugada2 == 3 && jugada1.equals("pedra")) || (jugada2 == 1 && jugada1.equals("tisora"))) {
                                        puntuacio2++;
                                        System.out.println("Jugador2");

                                    } else if ((jugada1.equals("pedra") && jugada2 == 2) || (jugada1.equals("tisora") && jugada2 == 3) || (jugada1.equals("paper") && jugada2 == 2)) {
                                        puntuacio1++;
                                        puntuacio2++;
                                        System.out.println("EMPAT");
                                    }
                                }
                                if (puntuacio1 == 5) {
                                    System.out.println("Has guanyat");
                                    conveses+=("Has guanyat"+"\n");
                                    win = ("tu");
                                    ordre[4]=true;
                                    break;

                                } else if (puntuacio2 == 5) {
                                    System.out.println("Has perdut");
                                    conveses+=("Has perdut"+"\n");
                                    win = ("ell");
                                    ordre[4]=true;
                                    break;
                                }
                            }

                        } else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        }
                    }else {System.out.println("No es pot jugar en mode JOEL!!");
                        conveses+=("No es pot jugar en mode JOEL!!"+"\n");
                        ordre[4]=true;}
                    break;
                case 6://6
                    if (ordre[4] &&  ordre[5]==false) {

                        if (mostrar) System.out.println("Quin nom em vols posar?");

                        nom = entrada.nextLine();
                        System.out.println("Gracies,m'agrada molt el nom de " + nom);
                        conveses += "Gracies, m'agrada molt el nom de " + nom + "\n";
                        ordre[5] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 7://7
                    if (ordre[5] ||ordre[6]) {
                        System.out.println("Em dic " + nom + " i he nascut " + sexe + ". El meu esport favorit es el " + tria + ". El meu numero favorit es " + (num2 - 1) );
                        conveses+="Em dic " + nom + " i he nascut " + sexe + ". El meu esport favorit es el " + tria + ". El meu numero favorit es " + (num2 - 1)+ "\n";
                        if (mostrar){
                            System.out.println("ha guanyat "+win);
                            conveses+=("ha guanyat "+win+"\n" );
                        }
                        ordre[6]=true;
                        break;
                    }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}


                case 8://8
                    if (ordre[6] == true) {
                        return conveses;

                    }else {System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;}

            }

        }

    }
}
