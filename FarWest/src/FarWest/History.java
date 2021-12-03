package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class History {


    public static void main(String[] args) {
        Human human1 = new Human("Boris");
        Human brigand1 = new Brigand("Quentin", "la binouze");

        human1.presentation();
        human1.speak();

        brigand1.presentation();
    }
}
