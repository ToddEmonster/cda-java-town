package fr.western.human.character;

import fr.western.human.Human;

public class Lady extends Human {

    private boolean isCaptive;
    private String dressColor;

    // CONSTRUCTORS
    public Lady(String name) {
        super(name, "milk");
        this.isCaptive = false;
        this.dressColor = "blue";
    }

    public Lady(String name, String favoriteDrink) {
        super(name, favoriteDrink);
        this.isCaptive = false;
        this.dressColor = "blue";
    }

    public Lady(String name, String favoriteDrink, String dressColor) {
        super(name, favoriteDrink);
        this.isCaptive = false;
        this.dressColor = dressColor;
    }

    // GETTERS
    public boolean getIsCaptive() {
        return this.isCaptive;
    }

    public String getDressColor(){
        return this.dressColor;
    }

    // SETTERS
    public String setDressColor(String dressColor) {
        this.dressColor = dressColor;
        return this.talk("Look at my new " + this.dressColor + "dress !");
    }

    public void setIsCaptured(boolean value){
        this.isCaptive = value;
    }

    // ACTIONS
    public String yell(){
        return this.talk("HEEEEELLLLLPPPPP !!!");
    }

    public String thankFull(Cowboy cowboy){
        return this.talk("Thank you my hero " + cowboy.getName() + " ! You saved me !");
    }

    public String introduce(){
        return this.talk("Miss " + this.getName() + ".") ;
    }
}
