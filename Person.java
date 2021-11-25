
import java.util.Random;
import java.util.Scanner;



public class Person {
    // Constructor
    void Person() {
    }

    boolean talking() {

        System.out.println("Hola, que tal!");
        System.out.println("Tria una pregunta les has de respondre totes");
        System.out.println("1. Quin tipus de persona ets?");
        System.out.println("2. Quin esport t’agrada?");
        System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
        System.out.println("4. Sabries llista tots els nombres parells resultants de la multiplicació, entre el valor enter de a i b, on el valor de a creixerà fins b, b decreixerà fins a ? ");
        System.out.println("5. Juguem a pedra paper i tisora? ");
        System.out.println("6. Posa-li un nom:");
        System.out.println("7. Pots recordar-me la nostra conversa?");
        System.out.println("8. Sortida de l’aplicació.");
        //variables
        //escaners
        Scanner entrada = new Scanner(System.in);
        byte pregunta;
        //nom
        String nom = "";
        //pedra paper tizora
        String jugada1;
        double jugada2;
        int puntuacio1 =0;
        int puntuacio2 = 0;
        String win = "";

        //multiplicacions
        int a;
        int b;
        //tipusdepersona
        int num;

        String sexe = "";

        //esport
        int esport;
        String tria = "";
        //nombre preferit
        int rang;
        int numt = 0;
        int numtv = numt;//guardem el nombre
        //sortida
        String obcio;
        //proces
        while (true) {
            System.out.println("1. Quin tipus de persona ets?");
            System.out.println("2. Quin esport t’agrada?");
            System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
            System.out.println("4. Sabries llista tots els nombres parells resultants de la multiplicació, entre el valor enter de a i b, on el valor de a creixerà fins b, b decreixerà fins a ? ");
            System.out.println("5. Juguem a pedra paper i tisora? ");
            System.out.println("6. Posa-li un nom:");
            System.out.println("7. Pots recordar-me la nostra conversa?");
            System.out.println("8. Sortida de l’aplicació.");
            pregunta = entrada.nextByte();
            switch (pregunta) {
                case 1:
                    Scanner entrada1 = new Scanner(System.in);
                    System.out.println("Digues quin tipus persona soc amb un numero del 1 al 100");
                    num = entrada1.nextInt();
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
                    break;
                case 2:
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.println("Digues un nombre del 1 al 10 aques sera el meu esport preferit");
                    esport = entrada2.nextInt();
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

                    break;
                case 3:
                    System.out.println("donam un rang");
                    Scanner entrada3 = new Scanner(System.in);
                    rang = entrada3.nextInt();

                    numtv = (rang / 2);//guardem el nombre
                    for (numt = 0; numt <= rang / 2; numt++) {
                        System.out.print(numt + " ");
                    }
                    System.out.print("aquest es el nombre");
                    System.out.println();


                    break;
                case 4:
                    Scanner entrada4 = new Scanner(System.in);
                    System.out.println("Quins dos nombres hem de multiplicar?");
                    a = entrada4.nextInt();
                    b = entrada4.nextInt();
                    for (int i = a; i <= b; i++) {
                        System.out.println();
                        for (int j = b; j >= 1; j--) {
                            if ((i * j) % 2 == 0) System.out.print(i * j + "  ");
                        }

                    }
                    System.out.println();
                    break;

                case 5:
                    Scanner entrada5 = new Scanner(System.in);
                    while (puntuacio1 < 5 || puntuacio2 < 5) {
                        System.out.println("digues pedra ,paper o tisora una de les 3 ");
                        jugada1 = entrada5.nextLine();
                        jugada2 = new Random().nextInt(3)+1;
                        System.out.println(jugada2);
                        //1 es paper 2 es pedra 3 es tisores
                        if ((jugada1.equals("pedra") && jugada2 == 1 )|| (jugada1.equals("tisora") && jugada2 == 2 )|| (jugada1.equals("paper") && jugada2 == 3)) {
                            puntuacio1++;
                            System.out.println("Jugador1");
                        } else {
                            if ((jugada2 == 2 && jugada1.equals("paper") )||(jugada2 == 3 && jugada1.equals("pedra") )|| (jugada2 == 1 && jugada1.equals("tisora"))) {
                                puntuacio2++;
                                System.out.println("Jugador2");

                            } else if ((jugada1.equals("pedra") && jugada2 == 2 )|| (jugada1.equals("tisora") && jugada2 == 3 )|| (jugada1.equals("paper") && jugada2 == 2) ){
                                puntuacio1++;
                                puntuacio2++;
                                System.out.println("EMPAT");


                            }
                        }


                        if (puntuacio1 == 5) {
                            System.out.println("Has guanyat");
                            win = ("tu");
                            break;
                        } else if (puntuacio2 == 5) {
                            System.out.println("Has perdut");
                            win = (nom);
                            break;
                        }
                    }
                        break;
                case 6:
                    Scanner entrada6 = new Scanner(System.in);
                    System.out.println("Quin nom em vols posar?");
                    nom = entrada6.nextLine();
                    System.out.println("Gràcies, m’agrada aquest nom");
                    break;

                case 7:
                    System.out.println(" el meu nom es " + nom + " el meu sexe es " + sexe + " el meu Esport preferit es " + tria + " el meu número preferit es " + numtv + " ha guanyat " + win);


                    break;
                case 8:
                    Scanner entrada8 = new Scanner(System.in);
                    System.out.println("estas segur de que vols tancar?(digues si o no)");
                    obcio = entrada8.nextLine();
                    if (obcio.equals("si")) {
                        return true;
                    }
                    if (obcio.equals("no")) {
                        break;
                    }


            }

        }

    }
