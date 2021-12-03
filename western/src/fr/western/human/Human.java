package fr.western.human;

public class Human {
    private String name;
    private String favoriteDrink;

    public Human(String name) {
        this.name = name;
        this.favoriteDrink = "Water";
    }

    public Human(String name, String favoriteDrink) {
        this.name = name;
        this.favoriteDrink = favoriteDrink;
    }

    public String speak(String sentence){
        return this.name + " " + sentence;
    }

    public String introduce(){
        return "Hi i'm " + this.name + " and my favorite drink is " + this.favoriteDrink.toLowerCase() +". SLURP !" ;
    }

    public String drink() {
        return "Sah ! A great glass of " + this.favoriteDrink.toLowerCase() + ".";
    }

    public String getName(){
        return this.name;
    }

    public String getFavoriteDrink(){
        return this.favoriteDrink;
    }

}
