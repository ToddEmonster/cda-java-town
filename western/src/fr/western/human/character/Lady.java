package fr.western.human.character;

import fr.western.human.Human;

public class Lady extends Human {

    private boolean isCaptive;
    private String dressColor;

    // CONSTRUCTORS
    public Lady(String name) {
        super(name);
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

    public boolean getIsCaptive() {
        return this.isCaptive;
    }

    public String getDressColor(){
        return this.dressColor;
    }

    public String setDressColor(String dressColor) {
        this.dressColor = dressColor;
        return this.talk("Look at my new " + this.dressColor + "dress !");
    }

    public void setIsCaptured(boolean value){
        this.isCaptive = value;
    }

    public String yell(){
        return this.talk("HEEEEELLLLLPPPPP !!!");
    }

    public String thankFull(Cowboy cowboy){
        return this.talk("Thank you my hero " + cowboy.getName() + " ! You saved me !");
    }
}
