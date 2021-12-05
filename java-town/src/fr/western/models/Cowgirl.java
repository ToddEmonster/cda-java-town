package fr.western.models;

public class Cowgirl extends Human {
    protected int popularity;
    protected String virtue;

    public Cowgirl(String name) {
        this(name, 0, "vaillante");
    }

    public Cowgirl(String name, int popularity) {
        this(name, popularity, "vaillante");
    }

    public Cowgirl(String name, String virtue) {
        this(name, 0, virtue);
    }

    public Cowgirl(String name, int popularity, String virtue) {
        super(name);
        this.popularity = popularity;
        this.virtue = virtue;
        this.favoriteDrink = "NHONSKY";
    }

    public void introduceSelf() {
        super.introduceSelf();
        String numberOfFans;
        switch (this.popularity) {
            case 0 :
                numberOfFans = "... personne";
                break;
            case 1 :
                numberOfFans = this.popularity + " personne";
                break;
            default:
                numberOfFans = this.popularity + " personnes";
        }
        this.talk("On dit de moi que je suis "
                + this.virtue
                + ", je suis populaire auprès de "
                + numberOfFans);
    }

    public void shootOn(IOutlaw rascal) {
        System.out.println("[ La " + this.virtue + " " + this.getName()
                + " tire sur " + rascal.getName() + ". PAN ! ]");
        this.talk("Prend ça, rascal !");
    }

    public void free(Sir victim) {
        if (victim.isCaptive()) {
            this.talk("Cher monsieur " + victim.getName() +", vous voici libre !");
            victim.getFreedBy(this);
        } else {
            this.talk("Mais, monsieur " + victim.getName() +", vous êtes déjà libre !");
        }
    }

    @Override
    public String toString() {
        return "[ Voici la Cowgirl " + this.name +
                ", elle a un niveau de popularité à " + popularity +
                " et est réputée pour être " + virtue +
                "]";
    }
}
