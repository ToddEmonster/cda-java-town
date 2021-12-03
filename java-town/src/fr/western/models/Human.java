package fr.western.models;

public class Human {
    private String name;
    private String favoriteDrink = "WATAH";

    public Human(String name) {
        this.name = name;
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

    public void talk(String text) {
        System.out.println("[" + this.name + "] - " + text);
    }

    public void introduceSelf() {
        this.talk("Howdy ! Mon nom est " + this.name +
                ", ma boisson favorite est " + this.favoriteDrink);
    }

    public void drink() {
        this.talk("Aaah ! Un bon verre de " + this.favoriteDrink
            + "! GLOUPS !");
    }
}
