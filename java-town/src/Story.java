import fr.western.models.Human;
import fr.western.models.Sieur;

public class Story {

    public static void main(String[] args) {
        System.out.println("Welcome in Reverso Mundo >:D");
        Human boris = new Human("Boris");

        boris.talk("coucou");
        boris.introduceSelf();
        boris.drink();

        Sieur luke = new Sieur("Lucky Luke");
        Sieur rosario = new Sieur("Rosario DelMundo", "rose");
        Sieur tom = new Sieur ("Tom Sawyer", false);
        Sieur voldemort = new Sieur ("Tom Jedusor", "noire", true);
        System.out.println(luke + "\n" + rosario + "\n" + tom + "\n" + voldemort);

        System.out.println("La robe de " + luke.getName() + " est " + luke.getDressColor());
        luke.setDressColor("verte");

        rosario.getKidnapped();
    }
}
