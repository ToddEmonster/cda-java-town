package fr.western.models;

public class Brigand extends Human {
    private String look;
    private int reward;
    private boolean isInJail;

    public Brigand(String name) {
        this(name, "méchant", 100, false);
    }

    public Brigand(String name, String look) {
        this(name, look, 100, false);
    }

    public Brigand(String name, int reward) {
        this(name, "méchant", reward, false);
    }

    public Brigand(String name, boolean isInJail) {
        this(name, "méchant", 100, isInJail);
    }

    public Brigand(String name, String look, int reward) {
        this(name, look, reward, false);
    }

    public Brigand(String name, String look, boolean isInJail) {
        this(name, look, 100, isInJail);
    }

    public Brigand(String name, int reward, boolean isInJail) {
        this(name, "méchant", reward, isInJail);
    }

    public Brigand(String name, String look, int reward, boolean isInJail) {
        super(name);
        this.look = look;
        this.reward = reward;
        this.isInJail = isInJail;
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
