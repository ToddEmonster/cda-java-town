package fr.trainning.example;

public class Cowboys extends Humain {

    private int popularite;
    private String adjectif;

    public Cowboys(String nom, int popularite){
        super(nom, "whisky");
        this.popularite = popularite;
        this.adjectif = "vaillant";
    }

    public void tirer(Brigand brigand){
        System.out.println("Le " + this.adjectif + " " + this.quel_est_ton_nom() + " tire sur " + brigand.quel_est_ton_nom() + ". PAN !");
        System.out.println("Prend ça, rascal");
    }

    public void libererDame(Dames dame) {
        System.out.println("Permettez-moi de vous dire que vous avez une très belle robe " + dame.getCouleurRobe() + " madame.");
    }



}