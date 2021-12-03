import fr.western.models.*;

import java.util.Scanner;

public class Story {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome in Reverso Mundo >:D");

        System.out.println("\nQue veux-tu tester ? (human/sieur/brigand/cowgirl/all) :");
        String answer = scanner.next().toLowerCase();

        switch(answer) {
            case "human":
                testHuman();
                break;
            case "sieur":
                testSieur();
                break;
            case "brigand":
                testBrigand();
                break;
            case "cowgirl":
                testCowgirl();
                break;
            default:
            case "all":
                testHuman();
                testSieur();
                testBrigand();
                testCowgirl();
                break;
        }
    }

    private static void testHuman() {
        System.out.println("\n");
        Human boris = new Human("Boris");
        boris.talk("coucou");
        boris.introduceSelf();
        boris.drink();
    }

    private static void testSieur() {
        System.out.println("\n");
        Sieur luke = new Sieur("Lucky Luke");
        Sieur rosario = new Sieur("Rosario DelMundo", "rose");
        Sieur tom = new Sieur ("Tom Sawyer", false);
        Sieur voldemort = new Sieur ("Tom Jedusor", "noire", true);
        System.out.println(luke + "\n" + rosario + "\n" + tom + "\n" + voldemort);

        System.out.println("La robe de " + luke.getName() + " est " + luke.getDressColor());
        luke.setDressColor("verte");

        rosario.getKidnapped();
    }

    private static void testBrigand() {
        System.out.println("\n");
        Brigand joe = new Brigand("Joe Dalton");
        Brigand william = new Brigand("William Dalton", "cool" );
        Brigand jack = new Brigand("Jack Dalton", 300);
        Brigand averell = new Brigand("Averell Dalton", "gentil", 50, true);

        Brigand miaouss = new Brigand("Miaouss Team Rocket", true);

        System.out.println(joe + "\n" + william + "\n" + jack + "\n" + averell + "\n" + miaouss);

        Brigand janet = new Brigand("Calamity Janet", 1000);
        Sieur sacha = new Sieur("Sacha Ketchum");
        Cowgirl jessie = new Cowgirl("Jessie James");
        System.out.println("Pour Jessie : " + janet.getReward() + " $");
        janet.kidnap(sacha);
        janet.getCapturedBy(jessie);
    }

    private static void testCowgirl() {
        System.out.println("\n");
        Cowgirl jessie = new Cowgirl("Jessie James");
        Cowgirl lucky = new Cowgirl("Lucky Luke");

    }




}
