package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class Ripoux extends Sherif implements iRipoux {
    private int totalKidnapping;
    private boolean arrested;

    Ripoux(String name, String boisson){
        super (name, boisson);
    }

    public String kidnaping(Madam madam ){
        madam.kidnapped();
        this.totalKidnapping+=1;
        return this.talk(madam.name+", tu est mienne désormais");
    }

    public String arrested(CowBoy cowBoy){
        this.arrested = true;
        return this.talk("Damned, je suis fait!" +cowBoy.name+", tu m'as eu!");
    }

    protected String getName(){
        return super.name;
    }

    public int getWanted(){
        return ThreadLocalRandom.current().nextInt(1, 100000 + 1);
    }
    public String giveName(){
        return this.name;
    }
}
