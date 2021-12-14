package codi;

import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
    public static boolean mostrar;

    public static void main(String[] args) {


        int num = Integer.parseInt(entrada.nextLine());
        mostrar = num != 0;
        int quants;
        int quant=-1;
        String[] converses;
        quants = Integer.parseInt(entrada.nextLine());
        num =quants;
        converses = new String[quants];
        while (true) {
            if (mostrar) System.out.println("1. Conversar.");
            if (mostrar) System.out.println("2. Mostrar conversa.");
            if (mostrar) System.out.println("3. Sortir del programa.");
            switch (entrada.nextInt()) {

                case 1:
                    if(num==0) {System.out.println("No pots fer mes converses!!");break;}
                    boolean finish = false;
                    if (mostrar) System.out.println("Amb qui vols conversar?");
                    if (mostrar) System.out.println(" - Persona");
                    if (mostrar) System.out.println(" - Animal");
                    if (mostrar) System.out.println(" - Extraterrestre");
                    if (mostrar) System.out.print("Opció: ");

                    do {

                        // Escollir amb qui volem conversar

                        switch (entrada.nextLine()) {

                            case "Persona":
                                Person person = new Person();
                                quant ++;
                                converses[quant] = person.talking();

                                num --;
                                break;
                            case "Animal":
                                Animal animal = new Animal();
                                quant ++;
                                converses[quant] = animal.talking();

                                num --;
                                break;
                            case "Extraterrestre":
                                quant ++;
                                Alien extraterrestre = new Alien();
                                converses[quant] = extraterrestre.talking();
                                num --;
                                break;
                            default:
                                System.out.println("Ens inexistent, prova en un altre!!");
                                break;

                        }
                    } while (num!=0);
                    break;
                case 2:
                    if (quant==-1) System.out.println("No hi ha converses a mostrar!!");
                    else{
                   if (mostrar) System.out.printf("quina conversa vols veure (1-%d):",quants);
                    int i = entrada.nextInt();
                    System.out.println(converses[i-1]);}
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
