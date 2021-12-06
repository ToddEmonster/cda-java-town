package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class CowBoy extends Human{

    private int popularity;
    private String desc;
    private int totalRewards;
    public int minimumRewards;

    CowBoy(String name, String boisson){
        super(name);
        this.desc = "Valeureux";
        this.boisson = boisson;
        this.totalRewards = 0;
        this.minimumRewards = ThreadLocalRandom.current().nextInt(1, 100000+1);
    }


    protected String shoot(Brigand brigand){
        this.totalRewards+=brigand.getReward();
        return this.talk("Le "+this.desc+" "+this.name+" tire sur "+brigand.name+". PAN! "+System.getProperty("line.separator")+"Prend ça rascal!");
    }

    protected String liberate(Madam madam){
        this.popularity+=1;
        madam.setLibertyState("Libre");
        return this.talk("Vous voilà libéré très chère "+madam.name+", voulez vous venir vous reposer dans ma demeure?");
    }
    protected String information(Brigand brigand){
        return  this.talk("Voyons voir de combien est la récompense pour ce lascar");
    }

    protected boolean choice(Brigand brigand, boolean tmp){
        if (brigand.getReward() < this.minimumRewards){
            tmp = false;
        }
        else if (brigand.getReward() > this.minimumRewards){
            tmp = true;
        }
        return tmp;
    }
    protected String falseChoice(){
        return this.talk("Je ne vais pas courir après un bandit pour si peux, j'en demande pas moins de " + this.minimumRewards);
    }
    protected String trueChoice(){
        return this.talk("En selle, allons chasser du dalton!");
    }
}
