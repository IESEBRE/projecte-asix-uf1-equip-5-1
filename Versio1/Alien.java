package codi;

import java.util.Random;
import java.util.Scanner;

import static codi.Main.entrada;
import static codi.Main.mostrar;

public class Alien {
    // Constructor
    void Alien() {
    }

    String talking() {
        boolean ordre[];
        ordre = new boolean[7];
        String nombre = "";
        String tipus = "";
        String vitage = "";
        float favorit = 0;
        float num1;
        float opcio;
        float num2;
        float num;
        float primer;
        float segon;
        String nom;
        String conveses = "";
        String obcio;
        int intents = 0;
        while (true) {
            if (mostrar) System.out.println("1. Quin tipus d’extraterrestre ets? ");
            if (mostrar) System.out.println("2. Com et desplaces? ");
            if (mostrar) System.out.println("3. Quin és el teu número favorit entre 0,0 i ...? ");
            if (mostrar)
                System.out.println("4. Sabries llista tots els números que amb decimal després de la coma igual a #,5 després \n" +
                        "de la operació (a+b)/2, entre el valor float de a i b, on el valor de a creixerà fins b, b \n" +
                        "decreixerà fins a ?");
            if (mostrar) System.out.println("5. Juguem als barquets? ");
            if (mostrar) System.out.println("6. Posa-li un nom");
            if (mostrar) System.out.println("7. Pots recordar-me la nostra conversa? ");
            if (mostrar) System.out.println("8. Sortir");

            opcio = Float.parseFloat(entrada.nextLine());

            switch ((int) opcio) {
                case 1:


                    if (mostrar) System.out.println("Introduix un numero float de 0-10: ");
                    num1 = Float.parseFloat(entrada.nextLine());;
                    if (num1 == 0.5 || num1 == 1.5 || num1 == 2.5 || num1 == 3.5 || num1 == 4.5 || num1 == 5.5 || num1 == 6.5 || num1 == 7.5 || num1 == 8.5 || num1 == 9.5) {
                        System.out.println("Soc un alien,no m'has vist");
                        tipus = "sucubo";
                    } else if ((num1 > 0.5 && num1 < 1.0) || (num1 > 1.5 && num1 < 2.0) || (num1 > 2.5 && num1 < 3.0) || (num1 > 3.5 && num1 < 4.0) || (num1 > 4.5 && num1 < 5.0) || (num1 > 5.5 && num1 < 6.0) || (num1 > 6.5 && num1 < 7.0) || (num1 > 7.5 && num1 < 8.0) || (num1 > 8.5 && num1 < 9.0) || (num1 > 9.5 && num1 < 10.0)) {
                        System.out.println("Soc un Alien de Pau");
                        tipus = "de pau";
                    } else System.out.println("Sou un Alien, et mataré ");
                    tipus = "assassi";
                    ordre[0] = true;
                    conveses += tipus + "\n";
                    break;
                case 2:
                    if (ordre[0] && ordre[1] == false) {
                        if (mostrar) System.out.println("Introduix un numero float de 0,0-1,0: ");
                        num1 = Float.parseFloat(entrada.nextLine());;

                        if (num1 == (float) 0.1) {
                            System.out.println("Navegant");
                            vitage = "Navegant";
                        }
                        if (num1 == (float) 0.2) {
                            System.out.println("Flotant");
                            vitage = "Flotant";
                        }
                        if (num1 == (float) 0.3) {
                            System.out.println("Propulsat");
                            vitage = "Propulsat";
                        }
                        if (num1 == (float) 0.4) {
                            System.out.println("Patinant");
                            vitage = "Patinant";
                        }
                        if (num1 == (float) 0.5) {
                            System.out.println("Caminant");
                            vitage = "Caminant";
                        }
                        if (num1 == (float) 0.6) {
                            System.out.println("Coetejant");
                            vitage = "Coetejant";
                        }
                        if (num1 == (float) 0.7) {
                            System.out.println("Planejant");
                            vitage = "Planejant";
                        }
                        if (num1 == (float) 0.8) {
                            System.out.println("Corrent");
                            vitage = "Corrent";
                        }
                        if (num1 == (float) 0.9) {
                            System.out.println("Saltant");
                            vitage = "Saltant";
                        }
                        if (num1 == (float) 1.0) {
                            System.out.println("Levitant");
                            vitage = "Levitant";
                        }
                        conveses += vitage + "\n";
                        ordre[1] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 3:
                    if (ordre[1] && ordre[2] == false) {
                        num2 = Float.parseFloat(entrada.nextLine());;
                        if (mostrar) System.out.println("Quin és el teu número favorit entre 0,0 i ...?");
                        for (num = (float) 0; num < num2 / 2.0; num = (float) (num + 0.1)) {
                            System.out.printf("%2.1f ", num);
                            conveses+= String.format("%2.1f ", num);
                            //System.out.println(num);
                        }
                        System.out.println("...He triat el " + num2 / 2.0 + "!");
                        conveses += ("...He triat el " + num2 / 2.0 + "!");
                        favorit = num2;
                        ordre[2] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 4:
                    if (ordre[2] && ordre[3] == false) {

                        float a = Float.parseFloat(entrada.nextLine());
                        float b = Float.parseFloat(entrada.nextLine());
                        float tempb = b;
                        float tempa = a;
                        while (tempa <= b) {
                            tempb = b;

                            while (a <= tempb) {
                                float op = (tempa + tempb) / 2;
                                if (op % 1 == 0.5) {
                                    System.out.print(op + "\t");
                                    conveses+=(op + "\t");
                                }
                                tempb -= 1;
                            }
                            tempa += 1;
                            System.out.print("\n");
                            conveses+=("\n");
                        }

                        System.out.print("\n");
                        conveses+=("\n");
                        ordre[3] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");

                        break;
                    }
                case 5:
                    if (mostrar) {
                        if (ordre[3] && ordre[4] == false) {
                            float j1;
                            float in = 1.0F;
                            float fi = 5.0F;
                            Random random = new Random();
                            float baixell = random.nextFloat() * (fi - in);
                            baixell = Math.round(baixell * 10.0F) / 10.0F;

                            float resultat;
                            do {
                                j1 = Float.parseFloat(entrada.nextLine());;
                                resultat = j1 - baixell;
                                if (j1 == baixell) {
                                    System.out.println("Tocat");
                                    conveses+=("Tocat");
                                    break;
                                } else if (resultat <= 0.3F){ System.out.println("Estas a prop");
                                    conveses+=("Estas a prop");}
                                else if (resultat > 0.3F && resultat <= 1.0F) {System.out.println("Estas a lluny");
                                    conveses+=("Estas a lluny");}
                                else if (resultat > 1.0F) {System.out.println("Estas mooolt lluny");
                                    conveses+=("Estas mooolt lluny");}
                                intents++;
                            }
                            while (intents <= 10);

                        }else{System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");}
                    } else {
                        System.out.println("No es pot jugar en mode JOEL!!");
                        ordre[4] = true;
                    }
                    break;

                case 6:
                    if (ordre[4] && ordre[5] == false) {
                        Scanner entrada6 = new Scanner(System.in);
                        if (mostrar) System.out.println("Posam un nom,");
                        nom = entrada6.nextLine();
                        System.out.println("Gracies, m'agrada molt el nom de " + nom);
                        conveses += ("Gracies, m'agrada molt el nom de " + nom);
                        nombre = nom;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 7:
                    if (ordre[5] && ordre[6] == false) {
                        System.out.println("Hem dic " + nombre + "  i soc un Alien " + tipus + ".  Em solc transportar " + vitage + ".  El meu numero favorit es el " + favorit / 2 + ".");
                        conveses += ("Hem dic " + nombre + "  i soc un Alien " + tipus + ".  Em solc transportar " + vitage + ".  El meu numero favorit es el " + favorit / 2 + ".");
                        if (mostrar){
                            System.out.println("ho has intentat "+intents+" vegades");
                            conveses+=("ho has intentat "+intents+" vegades");
                        }
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
    }
}
