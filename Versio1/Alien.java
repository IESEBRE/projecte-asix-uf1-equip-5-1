package codi;

import java.util.Scanner;
import java.util.Random;
import static codi.Main.mostrar;

public class Alien {
    // Constructor
    void Alien() {
    }

    boolean talking() {
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
        Scanner entrada = new Scanner(System.in);
        String obcio;
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

            opcio = entrada.nextFloat();

            switch ((int) opcio) {
                case 1:

                    Scanner entrada1 = new Scanner(System.in);
                    if (mostrar) System.out.println("Introduix un numero float de 0-10: ");
                    num1 = entrada1.nextFloat();
                    if (num1 == 0.5 || num1 == 1.5 || num1 == 2.5 || num1 == 3.5 || num1 == 4.5 || num1 == 5.5 || num1 == 6.5 || num1 == 7.5 || num1 == 8.5 || num1 == 9.5) {
                        System.out.println("Soc un alien,no m'has vist");
                        tipus = "Soc un alien,no m'has vist";
                    } else if ((num1 > 0.5 && num1 < 1.0) || (num1 > 1.5 && num1 < 2.0) || (num1 > 2.5 && num1 < 3.0) || (num1 > 3.5 && num1 < 4.0) || (num1 > 4.5 && num1 < 5.0) || (num1 > 5.5 && num1 < 6.0) || (num1 > 6.5 && num1 < 7.0) || (num1 > 7.5 && num1 < 8.0) || (num1 > 8.5 && num1 < 9.0) || (num1 > 9.5 && num1 < 10.0)) {
                        System.out.println("Soc un Alien de Pau");
                        tipus = "Soc un Alien de Pau";
                    } else System.out.println("Sou un Alien, et mataré ");
                    tipus = "Soc un Alien, et mataré";
                    ordre[0] = true;
                    break;
                case 2:
                    if (ordre[0] == true) {
                        num1 = entrada.nextFloat();
                        if (mostrar) System.out.println("Introduix un numero float de 0.0-1.0: ");
                        if (num1 == (float) 0.1) {
                            System.out.println("Superlumínico");
                        } else if (num1 == (float) 0.2) {
                            System.out.println("Nau");
                            vitage = "Nau";
                        } else if (num1 == (float) 0.3) {
                            System.out.println("Coet");
                            vitage = "Coet";
                        } else if (num1 == (float) 0.4) {
                            System.out.println("A la velocidtat del so");
                            vitage = "A la velocidtat del so";
                        } else if (num1 == (float) 0.5) {
                            System.out.println("Volant");
                            vitage = "Volant";
                        } else if (num1 == (float) 0.6) {
                            System.out.println("Propulsio");
                            vitage = "Propulsio";
                        } else if (num1 == (float) 0.7) {
                            System.out.println("Jet Pack");
                            vitage = "Jet Pack";
                        } else if (num1 == (float) 0.8) {
                            System.out.println("En patinet volador");
                            vitage = "En patinet volador";
                        } else if (num1 == (float) 0.9) {
                            System.out.println("Viatge en el temps");
                            vitage = "Viatge en el temps";
                        } else if (num1 == (float) 1.0) {
                            System.out.println("capsula");
                            vitage = "capsula";
                        }
                        ordre[1] = true;
                        break;
                    } else {
                        System.out.println("has de respondre les preguntes en ordre");
                        break;
                    }
                case 3:
                    if (ordre[1] == true) {
                        num2 = entrada.nextFloat();
                        if (mostrar) System.out.println("Quin és el teu número favorit entre 0,0 i ...?");
                        for (num = (float) 0; num < num2 / 2.0; num = (float) (num + 0.1)) {
                            System.out.printf("%2.1f ", num);
                            //System.out.println(num);
                        }
                        System.out.println("Has triat " + num2 / 2.0);
                        favorit = num2;
                        ordre[2] = true;
                        break;
                    } else {
                        System.out.println("has de respondre les preguntes en ordre");
                        break;
                    }
                case 4:
                    if (ordre[2] == true) {

                        primer = entrada.nextFloat();
                        segon = entrada.nextFloat();
                        for (float i = primer; i <= (float) ((primer + segon) / 2.0); i = (float) (i + 0.1)) {
                            System.out.printf("%2.1f ", i);
                            System.out.println();
                            for (float j = segon; j >= (float) ((primer + segon) / 2.0); j = (float) (j - 0.1)) {
                                System.out.printf("%2.1f ", j);
                            }
                        }

                        ordre[3] = true;
                        break;
                    } else {
                        System.out.println("has de respondre les preguntes en ordre");

                        break;
                    }
                case 5:
                    if (mostrar) {
                        float j1;
                        float in = 1.0F;
                        float fi = 5.0F;
                        Random random = new Random();
                        float baixell = random.nextFloat() * (fi - in);
                        baixell = Math.round(baixell * 10.0F) / 10.0F;
                        int intents = 0;
                        float resultat;
                        do {
                            j1 = entrada.nextFloat();
                            resultat=j1-baixell;
                            if (j1 == baixell) {
                                System.out.println("Tocat");
                                break;
                            } else if (resultat <= 0.3F ) System.out.println("Estas a prop");
                            else if (resultat> 0.3F && resultat <= 1.0F) System.out.println("Estas a lluny");
                            else if (resultat> 1.0F) System.out.println("Estas mooolt lluny");
                            intents++;
                        }
                        while (intents <= 10) ;
                    } else break;
                case 6:
                    if (ordre[4] == true) {
                        Scanner entrada6 = new Scanner(System.in);
                        if (mostrar) System.out.println("Posam un no,");
                        nom = entrada6.nextLine();
                        System.out.println("Gracies m'hagrada aquest nom " + nom);
                        nombre = nom;
                        break;
                    }else {System.out.println("has de respondre les preguntes en ordre");
                        break;}
                case 7:
                    if (ordre[5] == true) {
                        System.out.println("Hem dic " + nombre + " i  " + tipus + ".  Em  solc  desplacanr en " + vitage + " el meu número preferit es" + favorit + ".");
                        break;
                    }else {System.out.println("has de respondre les preguntes en ordre");
                        break;}
                case 8:
                    if (ordre[6] == true) {
                        Scanner entrada8 = new Scanner(System.in);
                        if (mostrar) System.out.println("estas segur de que vols tancar?(digues si o no)");
                        obcio = entrada8.nextLine();
                        if (obcio.equals("si")) {
                            return true;
                        }
                        if (obcio.equals("no")) {
                            break;
                        }
                    }else {System.out.println("has de respondre les preguntes en ordre");
                        break;}
            }
        }
    }
}
