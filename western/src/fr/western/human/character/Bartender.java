package fr.western.human.character;

import fr.western.human.Human;

public class Bartender extends Human {

    private String barName;

    // CONSTRUCTORS
    public Bartender(String name) {
            super(name, "Wine");
            this.barName = name + "'s";
        }

    public Bartender(String name, String barName) {
        super(name, "Wine");
        this.barName = barName;
    }


    // ACTIONS

    public String introduce(){
        return this.talk("Hi, I'm " +  this.getName() + " and I'm the bartender of " + this.barName + " coco.");
    }

    public String serveFavoriteDrink(Human human){
        return this.talk("Hey " + human.getName() + ", here is a cup of " + human.getFavoriteDrink() + ", you're favorite drink coco !");
    }

    }
