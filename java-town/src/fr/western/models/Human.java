package fr.western.models;

public class Human {
    protected String name;
    protected String favoriteDrink;

    public Human(String name) {
        this(name, "WATAH");
    }

    public Human(String name, String favoriteDrink) {
        this.name = name;
        this.favoriteDrink = favoriteDrink;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void setFavoriteDrink(String favoriteDrink) {
        this.favoriteDrink = favoriteDrink;
    }

    public void talk(String words) {
        System.out.println("[" + this.name + "] - " + words);
    }

    public void introduceSelf() {
        this.talk("Howdy ! Mon nom est " + this.name +
                ", ma boisson favorite est " + this.favoriteDrink);
    }

    public void drink() {
        this.talk("Aaah ! Un bon verre de " + this.favoriteDrink
            + " ! GLOUPS !");
    }
}
