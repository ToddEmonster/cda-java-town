package fr.western.models;

public class Sir extends Human {
    private String dressColor;
    private boolean isCaptive;

    public Sir(String name) {
        this(name, "bleue", false);
    }

    public Sir(String name, String dressColor) {
        this(name, dressColor, false);
    }

    public Sir(String name, boolean isCaptive) {
        this(name, "bleue", isCaptive);
    }

    public Sir(String name, String dressColor, boolean isCaptive) {
        super(name);
        this.dressColor = dressColor;
        this.isCaptive = isCaptive;
        this.favoriteDrink = "MILKU";
    }

    public String getDressColor() {
        return dressColor;
    }

    public void setDressColor(String dressColor) {
        this.dressColor = dressColor;
        this.talk("Regardez ma nouvelle robe " + this.dressColor + " !");
    }

    public boolean isCaptive() {
        return isCaptive;
    }

    public String getName() {
        return "Damoiseau " + this.name;
    }

    public void introduceSelf() {
        super.introduceSelf();
        this.talk("Ma robe si belle est de couleur " + this.dressColor);
    }

    public void getKidnapped() {
        this.isCaptive = true;
        this.talk("AU SECOUUUUURS !!!");
    }

    public void getFreedBy(Cowgirl liberator) {
        this.talk("Oh, merci de m'avoir libéré " + liberator.getName() + " !");
    }

    @Override
    public String toString() {
        String captiveState = this.isCaptive ? "captif" : "libre";
        return "{ Voici le Sieur " +
                this.name +
                ", qui porte une robe " + this.dressColor +
                " et est " + captiveState + ". }";
    }
}
