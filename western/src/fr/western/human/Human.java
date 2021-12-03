package fr.western.human;

public class Human {
    private String name;
    private String favoriteDrink;

    // CONSTRUCTORS
    public Human(String name) {
        this.name = name;
        this.favoriteDrink = "Water";
    }

    public Human(String name, String favoriteDrink) {
        this.name = name;
        this.favoriteDrink = favoriteDrink;
    }

    public String talk(String sentence){
        return this.name + "  -  " + sentence;
    }

    public String introduce(){
        return this.talk("Hi i'm " + this.name + " and my favorite drink is " + this.favoriteDrink.toLowerCase() +". SLURP !") ;
    }

    public String drink() {
        return this.talk("Sah ! A great glass of " + this.favoriteDrink.toLowerCase() + ".");
    }

    public String getName(){
        return this.name;
    }

    public String getFavoriteDrink(){
        return this.favoriteDrink;
    }

}
