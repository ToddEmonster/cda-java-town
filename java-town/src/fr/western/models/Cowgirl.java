package fr.western.models;

public class Cowgirl extends Human {
    private int popularity;
    private String virtue;

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
    }

    public void shootOn(Brigand rascal) {
        System.out.println("[ La " + this.virtue + " " + this.name
                + " tire sur " + rascal.getName() + ". PAN ! ]");
        this.talk("Prend ça, rascal !");
    }

    public void free(Sir victim) {
        if (victim.isCaptive()) {
            victim.getFreedBy(this);
            this.talk("Cher monsieur " + victim.getName() +", vous voici libre !");
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
