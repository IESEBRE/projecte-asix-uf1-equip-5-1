import java.util.Scanner;

public class Person {
    // Constructor
    void Person() {
    }

    boolean talking() {
        System.out.println("Hola, que tal!");
        System.out.println("Tria una pregunta les has de respondre totes");
        while (true) {
            System.out.println("1. Quin tipus de persona ets?");
            System.out.println("2. Quin esport t’agrada?");
            System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
            System.out.println("4. Sabries llista tots els nombres parells resultants de la multiplicació, entre el valor enter de a i b, on el valor de a creixerà fins b, b decreixerà fins a ? ");
            System.out.println("5. Juguem a pedra paper i tisora? ");
            System.out.println("6. Posa-li un nom:");
            System.out.println("7. Pots recordar-me la nostra conversa?");
            System.out.println("8. Sortida de l’aplicació.");
            //variables
            byte pregunta;
            //nom
            String nom =" ";
            //pedra paper tizora
            String jugada1;
            double jugada2;
            int puntuacio1 = 0;
            int puntuacio2 = 0;
            String win="";
            //escaners
            Scanner entrada = new Scanner(System.in);
            Scanner entrada6 = new Scanner(System.in);
            pregunta = entrada.nextByte();
            //multiplicacions
            int a;
            int b;
            int countb;
            int counta;
            //tipusdepersona
            int num;
            String sexe ="";
            //esport
            int esport;
            String tria="";
            //nombre preferit
            int rang;
            int numt;
            int numtv=0;//guardem el nombre
            //proces
            switch (pregunta) {
                case 1:
                    System.out.println("Digues quin tipus persona soc amb un numero del 1 al 100");
                    num = entrada6.nextInt();
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
                    }
                    continue;
                case 2:
                    System.out.println("Digues un nombre del 1 al 10 aques sera el meu esport preferit");
                    esport = entrada6.nextInt();
                    if (esport == 1) {
                        System.out.println("Natació");
                        tria = ("Natació");
                    }
                    if (esport == 2) {
                        System.out.println("Futbol");
                        tria = ("Futbol");
                    }
                    if (esport == 3) {
                        System.out.println("Voleibol");
                        tria = ("Voleibol");
                    }
                    if (esport == 4) {
                        System.out.println("Basquet");
                        tria = ("Basquet");
                    }
                    if (esport == 5) {
                        System.out.println("Tenis");
                        tria = ("Tenis");
                    }
                    if (esport == 6) {
                        System.out.println("Badminton");
                        tria = ("Badminton");
                    }
                    if (esport == 7) {
                        System.out.println("Beisbol");
                        tria = ("Beisbol");
                    }
                    if (esport == 8) {
                        System.out.println("Handbol");
                        tria = ("Handbol");
                    }
                    if (esport == 9) {
                        System.out.println("Hockey");
                        tria = ("Hockey");
                    }
                    if (esport == 10) {
                        System.out.println("Rugby");
                        tria = ("Rugby");
                    }

                    continue;
                case 3:
                    rang = entrada6.nextInt();
                    numt = (rang / 2);
                    numtv = (rang / 2);//guardem el nombre
                    for (numt = 0 ; numt <= rang/2; numt++) {
                        System.out.print(numt + " ");
                    }
                    System.out.print( "aquest es el nombre");
                    System.out.println();


                    continue;
                case 4:
                    System.out.println("Quins dos nombres hem de multiplicar?");
                    a = entrada6.nextInt();
                    b = entrada6.nextInt();
                    for (int i = a; i <= b; i++) {
                        System.out.println();
                        for (int j = b; j >= 1; j--) {
                            if ((i * j) % 2 == 0) System.out.print(i * j + "  ");
                        }

                    }
                    System.out.println();
                    continue;

                case 5:
                    while (puntuacio1 < 5 || puntuacio2 < 5) {
                        System.out.println("digues pedra ,paper o tisora una de les 3 ");
                        jugada1 = entrada6.nextLine();
                        jugada2 = (Math.random() * 3 + 1);
                        //1 es paper 2 es pedra 3 es tisores
                        if (jugada1.equalsIgnoreCase("pedra") && jugada2 == 1 || jugada1.equalsIgnoreCase("tisora") && jugada2 == 2 || jugada1.equalsIgnoreCase("paper") && jugada2 == 3) {
                            System.out.println("Jugador1");
                            puntuacio1++;

                        }
                        if (jugada2 == 2 && jugada1.equalsIgnoreCase("paper") || jugada2 == 3 && jugada1.equalsIgnoreCase("pedra") || jugada2 == 1 && jugada1.equalsIgnoreCase("tisora")) {
                            System.out.println("Jugador2");
                            puntuacio2++;
                        }


                        if (jugada1.equalsIgnoreCase("pedra") && jugada2 == 2 || jugada1.equalsIgnoreCase("tisora") && jugada2 == 3 || jugada1.equalsIgnoreCase("paper") && jugada2 == 2) {
                            System.out.println("EMPAT");
                            puntuacio1++;
                            puntuacio2++;
                        }
                        if (puntuacio1 == 5) {
                            System.out.println("Has guanyat");
                            win = ("tu");
                            continue;
                        } else if (puntuacio2 == 5) {
                            System.out.println("Has perdut");
                            win = (nom);
                            continue;
                        }
                    }

                case 6:
                    System.out.println("Quin nom em vols posar?");
                    nom = entrada6.nextLine();
                    System.out.println("Gràcies, m’agrada aquest nom");
                    continue;

                case 7:
                    System.out.println(" el meu nom es nom" + (nom) + " el meu sexe es"+ (sexe) +" el meu Esport preferit es "+(tria)+" el meu número preferit es"+(numtv)+" ha guanyat" + (win));


                    continue;
                case 8:
                    return false;


            }
            return true;
        }
    }
}
