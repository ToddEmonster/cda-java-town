package fr.western.models;

public class SirBrigand extends Sir implements IOutlaw {
    private int reward;
    private boolean isInJail;
    private int numberOfKidnappings;

    public SirBrigand(String name) {
        this(name, "noire");
    }

    public SirBrigand(String name, String dressColor) {
        this(name, dressColor, 100);
    }

    public SirBrigand(String name, int reward) {
        this(name, "noire", reward);
    }

    public SirBrigand(String name, String dressColor, int reward) {
        this(name, dressColor, reward, false);
    }

    public SirBrigand(String name, String dressColor, int reward, boolean isInJail) {
        super(name, dressColor, false);
        this.reward = reward;
        this.isInJail = isInJail;
    }

    public int getReward() {
        return 0;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }


    public boolean isInJail() {
        return false;
    }

    public int getNumberOfKidnappings() {
        return 0;
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
