package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class Sherif extends CowBoy {

    private int nbBrigand;
    private String wantedName;

    Sherif( String name, String boisson){
        super (name, boisson);
        this.nbBrigand = 0;
        this.minimumRewards = ThreadLocalRandom.current().nextInt(1, 100000 + 1);
    }

    public String setWanted(String wanted){
        this.wantedName = wanted;
        return this.talk("OYEZ BRAVE GENS !! "+this.minimumRewards+"$ à qui arretera"+this.wantedName + " le brigand mort ou vif");
    }
    protected String talk(){
        return "Sherif" + this.presentation() + ", j'ai déja arrêté "+ nbBrigand;
    }

}
