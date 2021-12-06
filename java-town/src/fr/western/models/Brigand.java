package fr.western.models;

public class Brigand extends Human implements IOutlaw, IPaleFace {
    private String look;
    private int reward;
    private boolean isInJail;
    private int numberOfKidnappings;

    public Brigand(String name) {
        this(name, "méchante", 100, false);
    }

    public Brigand(String name, String look) {
        this(name, look, 100, false);
    }

    public Brigand(String name, int reward) {
        this(name, "méchante", reward, false);
    }

    public Brigand(String name, boolean isInJail) {
        this(name, "méchante", 100, isInJail);
    }

    public Brigand(String name, String look, int reward) {
        this(name, look, reward, false);
    }

    public Brigand(String name, String look, boolean isInJail) {
        this(name, look, 100, isInJail);
    }

    public Brigand(String name, int reward, boolean isInJail) {
        this(name, "méchante", reward, isInJail);
    }

    public Brigand(String name, String look, int reward, boolean isInJail) {
        super(name);
        this.look = look;
        this.reward = reward;
        this.isInJail = isInJail;
        this.numberOfKidnappings = 0;
        this.favoriteDrink = "TORD-BOYARD";
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public String getName() {
        return this.name + " la " + this.look;
    }

    public int getNumberOfKidnappings() {
        return numberOfKidnappings;
    }

    public String getLook() {
        return look;
    }

    public boolean isInJail() {
        return isInJail;
    }

    public void introduceSelf() {
        super.introduceSelf();
        this.talk("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.numberOfKidnappings + " sieurs !");
        this.talk("Ma tête est mise à prix à hauteur de " + this.reward + " $ !");
    }

    public void kidnap(Sir victim) {
        this.talk("Ah ah ! " + victim.getName() + ", tu es mien désormais !");
        victim.getKidnapped();
        this.numberOfKidnappings += 1;
    }

    public void getCapturedBy(Cowgirl heroin) {
        this.isInJail = true;
        this.talk("Damned, je suis fait•e ! "
                + heroin.getName() + ", tu m'as eu•e !");
    }

    @Override
    public String toString() {
        String captiveState = isInJail ? "en taule, ha" : "en cavale, peuh";
        return "[ Voici le Brigand " + this.name +
                ", qui a un look " + look + ". " +
                reward + " $ pour sa tête... "+
                "Cette canaille est " + captiveState + " ! ]" ;
    }
}
