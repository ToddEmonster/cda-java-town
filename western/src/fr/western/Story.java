package fr.western;

import fr.western.human.Human;

public class Story {
    public static void main(String[] args) {

        // Q1.1
        Human testHuman = new Human("Sébastien");
        System.out.println(testHuman.introduce());
        System.out.println(testHuman.drink());

    }
}
