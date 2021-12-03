package fr.western.human.character;

import fr.western.human.Human;

public class Cowboy extends Human {

    private int popularity;
    private String adjective;

    // CONSTRUCTORS
    public Cowboy(String name) {
        super(name);
    }

    public Cowboy(String name, String favoriteDrink) {
        super(name, favoriteDrink);
    }

    public Cowboy(String name, String favoriteDrink, String adjective) {
        super(name, favoriteDrink);
        this.popularity = 0;
        this.adjective = adjective;
    }

    // GETTERS
    public int getPopularity() {
        return this.popularity;
    }

    public String getAdjective() {
        return this.adjective;
    }

    // ACTIONS

     public String taunt(){
        return this.talk("Take that you damn fellas !");
    }

    public String shoot(Brigand brigand){
        System.out.println(taunt());
        return this.talk("The " + this.getAdjective() + " " + this.getName() + " is shooting on " + brigand.getName() +". PAN ! ");
    }

    public String freeLady(Lady lady){
        this.popularity += 1;
        lady.setIsCaptured(false);
        return this.talk("You're free my beautifull " + lady.getName() + ". Take care of this " + lady.getDressColor() + " dress.");
    }

    public String introduce(){
        return this.talk(this.getName()) ;
    }

}
