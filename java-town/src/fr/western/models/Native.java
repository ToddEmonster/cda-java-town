package fr.western.models;

public class Native extends Human {
    private int numberOfFeathers;
    private String totem;

    public Native(String name) {
        this(name, "jus de racine", 0, "Coyote");
    }

    public Native(String name, int numberOfFeathers) {
        this(name, "jus de racine", numberOfFeathers, "Coyote");
    }

    public Native(String name, int numberOfFeathers, String totem) {
        this(name, "jus de racine", numberOfFeathers, totem);
    }

    public Native(String name, String favoriteDrink, int numberOfFeathers, String totem) {
        super(name, favoriteDrink);
        this.numberOfFeathers = numberOfFeathers;
        this.totem = totem;
    }

    public void talk(String words) {
        System.out.println("[" + this.name + "] - " + words + ",  !");
    }

    public void introduceSelf() {
        super.introduceSelf();
        this.talk("Je porte " + this.numberOfFeathers + " plumes.");
    }

    public void scalp(IPaleFace paleFace) {
        System.out.println("[ " + this.name + " scalpe le visage pâle " + paleFace.getName() + ". ]" );
        paleFace.talk("Aïe, ma tête !");
        this.numberOfFeathers += 1;
        this.talk("Une nouvelle plume pour moi.");
    }
}
