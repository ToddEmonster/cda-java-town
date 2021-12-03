package fr.western.models;

public class Cowgirl extends Human {
    private int popularity;
    private String virtue;

    public Cowgirl(String name) {
        this(name, 0, "vaillant");
    }

    public Cowgirl(String name, int popularity) {
        this(name, popularity, "vaillant");
    }

    public Cowgirl(String name, String virtue) {
        this(name, 0, virtue);
    }

    // Cowgirl lassie = new Cowgirl("Lassie", "badass");

    public Cowgirl(String name, int popularity, String virtue) {
        super(name);
        this.popularity = popularity;
        this.virtue = virtue;
    }

    public void shootOn(Brigand rascal) {
        System.out.println("[ Le" + this.virtue + " " + this.name
                + "tire sur " + rascal.getName() + ". PAN ! ]");
        this.talk("Prend ça, rascal !");
    }

    public void free(Sieur victim) {
        victim.getFreedBy(this);
        System.out.println("");
    }
}
