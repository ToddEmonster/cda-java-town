package fr.western.models;

public class CrookedCop extends Sheriff implements IOutlaw {
    private int reward;
    private int numberOfKidnappings;
    private boolean isInJail;

    public CrookedCop(String name) {
        super(name, 0, "malhonnête", 0);
    }

    public CrookedCop(String name, int popularity, int numberOfArrests) {
        this(name, popularity, "crooked", numberOfArrests);
    }

    public CrookedCop(String name, int popularity, String virtue, int numberOfArrests) {
        super(name, popularity, virtue, numberOfArrests);
    }

    public String getName() {
        return "Shérif " + this.name + " la " + this.virtue;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getNumberOfKidnappings() {
        return numberOfKidnappings;
    }

    public boolean isInJail() {
        return isInJail;
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
}
