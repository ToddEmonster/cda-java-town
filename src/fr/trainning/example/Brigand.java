package fr.trainning.example;

public class Brigand extends Humain {

    private String look = "méchant";
    private int nbDameEnleve;
    private int recompense = 100;
    private Boolean enPrison;

    public Brigand(String nom, String look){
        super(nom, "tord-boyaux");
        this.look = look;
        this.nbDameEnleve = 0;
        this.recompense = 100;
    }

    public void kidnapper(Dames dame){
        System.out.println("Ah ah ! " + dame.quel_est_ton_nom() + ", tu es mienne désormais");
    }

    public void emprisonner(Cowboys cowboys){
        System.out.println("Damned, je suis fait ! " + cowboys.quel_est_ton_nom() + ", tu m'as eu !");
    }

    public int capture(Brigand brigand){
        return brigand.recompense;
    }

    @Override
    public String quel_est_ton_nom(){
        return super.quel_est_ton_nom() + " le " + this.look;
    }

    @Override
    public void presenter(){
        System.out.println("Bonjour, je suis " + quel_est_ton_nom() + " et j'ai déjà kidnappé '" + this.nbDameEnleve + " dames !");
        System.out.println("ma tête est mise à prix " + this.recompense + " $");
    }

}