package fr.western.models;

public class Sheriff extends Cowgirl {
    protected int numberOfArrests;

    public Sheriff(String name) {
        this(name, 0, "honnête", 0);
    }

    public Sheriff(String name, int popularity) {
        this(name, popularity, "honnête", 0);
    }

    public Sheriff(String name, int popularity, int numberOfArrests) {
        this(name, popularity, "honnête", numberOfArrests);
    }

    public Sheriff(String name, int popularity, String virtue, int numberOfArrests) {
        super(name, popularity, virtue);
        this.numberOfArrests = numberOfArrests;
    }

    public String getName() {
        return "Shérif " + this.name;
    }

    public void introduceSelf() {
        super.introduceSelf();
        String bragWords;
        switch (this.numberOfArrests) {
            case 0:
                bragWords = "... ehrm, aucune brigand";
                break;
            case 1:
                bragWords = "1 brigand !";
                break;
            default:
                bragWords = this.numberOfArrests + " brigands !!";
                break;
        };
        this.talk("J'ai déjà coffré " + bragWords);
    }

    public int getNumberOfArrests() {
        return numberOfArrests;
    }

    public void setBountyOn(IOutlaw huntedBrigand, int reward) {
        System.out.println("[ Shérif " + this.name
                + " placarde une affiche dans toute la ville,"
                + " et régulièrement tonne de sa voix de stentor : ]");
        this.talk("OYEZ OYEZ BRAVES GENS !! "
                + reward + " $ à qui arrêtera "
                + huntedBrigand.getName()
                + ", morte ou vive !!");
        huntedBrigand.setReward(reward);
    };

    public void arrest(IOutlaw arrestedBrigand) {
        this.talk("Au nom de la loi, je vous arrête !");
        arrestedBrigand.getCapturedBy(this);
        this.numberOfArrests += 1;

    }
}
