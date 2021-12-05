package fr.western.models;

public class Barwoman extends Human{
    private String barName;


    public Barwoman(String name) {
        this(name, "Chez " + name);
    }

    public Barwoman(String name, String barName) {
        super(name);
        this.favoriteDrink = "VINO";
        this.barName = barName;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public void talk(String words) {
        System.out.println("[" + this.name + "] - " + words + ", Coco.");
    }

    public void serve(Human consumer) {
        this.talk("Voilà ton verre de " + consumer.getFavoriteDrink());
        consumer.drink();
    }
}
