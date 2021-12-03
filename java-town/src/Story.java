import fr.western.models.*;

import java.util.Scanner;

public class Story {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome in Reverso Mundo >:D");

        System.out.println("\nQue veux-tu tester ? (human/sir/brigand/cowgirl/all) :");
        String answer = scanner.next().toLowerCase();

        switch(answer) {
            case "human":
                testHuman();
                break;
            case "sir":
                testSir();
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
                testSir();
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

    private static void testSir() {
        System.out.println("\n");
        Sir luke = new Sir("Lucky Luke");
        Sir rosario = new Sir("Rosario DelMundo", "rose");
        Sir tom = new Sir("Tom Sawyer", false);
        Sir voldemort = new Sir("Tom Jedusor", "noire", true);
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
        Sir sacha = new Sir("Sacha Ketchum");
        Cowgirl jessie = new Cowgirl("Jessie James");
        System.out.println("Pour Jessie : " + janet.getReward() + " $");
        janet.kidnap(sacha);
        janet.getCapturedBy(jessie);
    }

    private static void testCowgirl() {
        System.out.println("\n");
        Cowgirl jessie = new Cowgirl("Jessie James");
        Cowgirl lucy = new Cowgirl("Lucy Luke", 100);
        Cowgirl james = new Cowgirl("James Jessie", "charismatique");

        System.out.println(jessie + "\n" + lucy + "\n" + james);

        System.out.println("\n");
        Brigand janet = new Brigand("Calamity Janet", 1000);
        Sir sacha = new Sir("Sacha Ketchum");
        janet.kidnap(sacha);

        lucy.shootOn(janet);
        lucy.free(sacha);
    }




}
