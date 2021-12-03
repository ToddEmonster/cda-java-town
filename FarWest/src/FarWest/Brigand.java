package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class Brigand extends Human{

    private String look;
    private int aKidnapping;
    private boolean arrested;
    private int reward;
    private String kidnapping;

    public Brigand(String name, String drink){
        super(name);
        this.boisson = drink;
        this.reward = ThreadLocalRandom.current().nextInt(1, 99999 + 1);
        this.look = "wicked";
    }

    public int getReward() {
        return reward;
    }

    private void kidnaping(){
        
    }

    private void arrested(){

    }
}
