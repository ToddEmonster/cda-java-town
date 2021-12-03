package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class Brigand extends Human{

    private String look;
    private int totalKidnapping;
    private boolean arrested;
    private int reward;
    private String kidnapping;

    public Brigand(String name, String drink){
        super(name);
        this.boisson = drink;
        this.reward = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
        this.look = "wicked";
        this.totalKidnapping = 0;
    }

    public int getReward() {
        return reward;
    }
    public void setReward(int reward) {
        this.reward += reward;
    }

    protected String showReward(){
        return "la récompense pour le bandit " + this.name + " est de " + this.getReward();
    }

    protected String kidnaping(Madam madam ){
        madam.kidnapped();
        this.totalKidnapping+=1;
        return this.talk(madam.name+", tu est mienne désormais");
    }

    protected String arrested(CowBoy cowBoy){
        this.arrested = true;
        return this.talk("Damned, je suis fait!" +cowBoy.name+", tu m'as eu!");
    }
}
