package fr.western.human.character;

import fr.western.human.Human;

public class Brigand extends Human {

    private String look;
    private int capturedLadiesCount;
    private float wantedReward;
    private boolean isInJail;


// CONSTRUCTORS
    public Brigand(String name) {
        super(name, "twist casings");
        this.look = "Bad";
        this.wantedReward = 100f;
        this.isInJail = false;
        capturedLadiesCount = 0;
    }

    public Brigand(String name, String favoriteDrink) {
        super(name, favoriteDrink);
        this.look = "Bad";
        this.wantedReward = 100f;
        this.isInJail = false;
        capturedLadiesCount = 0;
    }

    public Brigand(String name, String favoriteDrink, String look, float wantedReward) {
        super(name, favoriteDrink);
        this.look = look;
        this.wantedReward = wantedReward;
        this.capturedLadiesCount = 0;
        this.isInJail = false;
    }


    // GETTERS
    public String getLook() {
        return this.look;
    }

    public int getCapturedLadiesCount() {
        return this.capturedLadiesCount;
    }

    public float getWantedReward() {
        return this.wantedReward;
    }

    public boolean getIsInJail() {
        return this.isInJail;
    }


    // SETTERS
    void setIsInJail(boolean isInJail){
        this.isInJail = isInJail;
    }

    // ACTIONS
    public String kidnap(Lady lady){
        lady.setIsCaptured(true);
        this.capturedLadiesCount += 1;
        System.out.println(lady.yell());
        return this.talk("AHAH ! I catched you " + lady.getName() + " you're mine.");
    }

    public String getCatch(Cowboy cowboy){
        setIsInJail(true);
        return this.talk("Damn you " + cowboy.getName());
    }

    public String free(){
        setIsInJail(false);
        return this.talk("I'm free again !!");
    }

    public String introduce(){
        return (this.talk("I'm " + this.getName() + " the " + this.getLook() +".\n") +
        this.talk(" I'm looking " + this.getLook() + " and I already kidnapped " + this.capturedLadiesCount + " ladies.\n")
        + (this.talk("My head is rewarded for " + this.wantedReward + "$")));
    }

}
