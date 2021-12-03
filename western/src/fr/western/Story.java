package fr.western;

import fr.western.human.Human;
import fr.western.human.character.Brigand;
import fr.western.human.character.Cowboy;
import fr.western.human.character.Lady;

public class Story {
    public static void main(String[] args) {

        // 1.2

        Cowboy lukyLuke = new Cowboy("Luky Luke", "Beer", "Fastest shooter in the world" );
        Lady marianne = new Lady("Marianne", "Mojito", "Red");
        Brigand dalton = new Brigand("Joe Dalton", "Pepsi");


        System.out.println(lukyLuke.talk(lukyLuke.drink()));
        System.out.println(marianne.introduce());
        System.out.println(dalton.kidnap(marianne));
        System.out.println(lukyLuke.shoot(dalton));
        System.out.println(dalton.getCatch(lukyLuke));
        System.out.println(lukyLuke.freeLady(marianne));
        System.out.println(marianne.thankFull(lukyLuke));
    }
}
