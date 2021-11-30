import java.util.Random;
import java.util.Scanner;

public class Animal {
    void Animal() {
    }

    boolean talking() {
        String animalfinal = "";
        String nomguardar = "";
        char caracterfinal = ' ';
        int cout = 0;
        String obci;
        while (true) {

            System.out.println("");
            byte pregunta;
            String Tipo;


            System.out.println("Selecciona quina pregunta vols:");
            System.out.println("1.Quin tipus d’animal ets?");
            System.out.println("2.A que t’agrada jugar? ");
            System.out.println("3.Quin es el teu caracter favorit?");
            System.out.println("4.Sabries llista tots els caràcters amb valor Unicode parell i menors o iguals a Z resultants\n" +
                    "de la suma, entre el valor Unicode del primer i segon caracter, on el valor Unicode del\n" +
                    "primer creixerà fins al segon, el segon decreixera fins primer ? ");
            System.out.println("5.Juguem a fer onomatopeies? ");
            System.out.println("6.Posa-li un nom:");
            System.out.println("7.Pots recordar-me la nostra conversa?");
            System.out.println("8.Sortida");
            Scanner entradaPreguntes = new Scanner(System.in);
            pregunta = entradaPreguntes.nextByte();
            switch (pregunta) {
                case 1:
                    Scanner ani = new Scanner(System.in);
                    System.out.println("Defineix quin tipus d'animal ets:");
                    char animal = ani.next().charAt(0);
                    int difG = 'g' - animal;
                    int difS = 's' - animal;

                    //Definim els condiconals en funcion a la posició numerica en valor Unicode dels caracters alfanumerics.
                    if (difG >= -3 || animal <= 'g') {
                        System.out.println("Gos");
                        animalfinal = "gos";}
                    else if (difS <= -3 || animal >= 's') {
                        System.out.println("Serp");
                        animalfinal = "serp";
                    } else {
                        System.out.println("Mono");
                        animalfinal = "gos";
                    }

                    break;

                case 2:
                    String VLetra;
                    System.out.println("A que t'agrada jugar?");
                    Scanner entradaLetra = new Scanner(System.in);
                    VLetra = entradaLetra.nextLine();
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

                    break;
                case 3:

                    char Caracter;
                    char impresio = 'A';
                    System.out.println("Quin es el teu caracter favorit?");
                    Scanner entradaCaracter = new Scanner(System.in);
                    Caracter = entradaCaracter.next().charAt(0);
                    char contador = (char) ((Caracter - 'A') / 2);
                    caracterfinal = (char) (contador + 'A');

                    while (impresio != (char) (contador + 'A')) {
                        System.out.print(impresio + ",");
                        ++impresio;
                    }
                    System.out.printf(String.valueOf("el caracter que has elegit és " + caracterfinal + ","));
                    break;
                case 4:
                    break;
                case 5:
                    Scanner ono = new Scanner(System.in);
                    Random r = new Random();
                    System.out.println("Tria un caracter per formar una onomatopeia: ");

                    int numloop = 0;
                    while (numloop != 10) {

                        char variable1 = ono.next().charAt(0);
                        System.out.println("TU:" + variable1);
                        char variable2 = (char) (r.nextInt(26) + 'a');
                        System.out.println("ELL: " + variable2);
                        char variable3 = ono.next().charAt(0);
                        System.out.println("TU: " + variable3);
                        ++numloop;
                        String str = new StringBuilder().append(variable1).append(variable2).append(variable3).toString();
                        char vocal = str.charAt(1);

                        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u'){
                            System.out.println("La combinació " + str + " es una onomatopeia");
                            cout ++;}
                        else {System.out.println("La combinació " + str + " no es una onomatopeia");
                            cout ++;}
                    }
                    break;
                case 6:
                    System.out.println("Dona'm un nom");
                    Scanner entradaNom = new Scanner(System.in);
                    nomguardar = entradaNom.nextLine();
                    System.out.println("Gràcies,m'agrada aquest nom.");
                    break;
                case 7:
                    System.out.println("El meu nom es nom "+ nomguardar +" soc un " + animalfinal + " el meu caràcter favorit es " + caracterfinal +" el total de onomatopeies es " +cout+ ".");

                    break;
                case 8:

                    Scanner entrada8 = new Scanner(System.in);
                    System.out.println("estas segur de que vols tancar?(digues si o no)");
                    obci = entrada8.nextLine();
                    if (obci.equals("si")) {
                        return true;
                    }
                    if (obci.equals("no")) {
                        break;

                    }
            }
        }


    }
}
