import fr.western.models.Human;

public class Story {

    public static void main(String[] args) {
        System.out.println("Hello sexist world");
        Human boris = new Human("Boris");

        boris.talk("coucou");
        boris.introduceSelf();
        boris.drink();
    }
}
