package codi;

import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
    public static boolean mostrar;

    public static void main(String[] args) {


        int num = Integer.parseInt(entrada.nextLine());
        mostrar = num != 0;
        int quants;
        String[] conveses;
        quants = Integer.parseInt(entrada.nextLine());
        conveses = new String[quants];
        while (true) {
            if (mostrar) System.out.println("1. Conversar.");
            if (mostrar) System.out.println("2. Mostrar conversa.");
            if (mostrar) System.out.println("3. Sortir del programa.");
            switch (entrada.nextInt()) {

                case 1:
                    boolean finish = false;
                    if (mostrar) System.out.println("Amb qui vols conversar?");
                    if (mostrar) System.out.println(" - Persona");
                    if (mostrar) System.out.println(" - Animal");
                    if (mostrar) System.out.println(" - Extraterrestre");
                    if (mostrar) System.out.print("Opció: ");
                    do {
//                    Scanner scanner = new Scanner(System.in);
                        // Escollir amb qui volem conversar

                        switch (entrada.nextLine()) {
                            case "Persona":
                                Person person = new Person();
                                conveses[quants] = person.talking();
                                break;
                            case "Animal":
                                Animal animal = new Animal();
                                conveses[quants] = animal.talking();
                                break;
                            case "Aliem":
                                Alien extraterrestre = new Alien();
                                conveses[quants] = Alien.talking();
                                break;
                            default:
                                System.out.println("Ens inexistent, prova en un altre!!");
                                break;
                        }
                    }
                    while (!finish);
                    break;
                case 2:
                    System.out.println(conveses);
                    break;
                case 3:
                    return;

                default:
                    System.out.println("Opcio incorrecta. Torna-ho a intentar!!");
                    break;

            }
        }
    }
}
