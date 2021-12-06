package fr.town;



public class Barman extends Humain {
    public final String FIN_DE_PHRASE = " coco";

    private String nomDeBar;


    public Barman(String nom) {
        super(nom);
        this.nomDeBar = nomDeBar;
    }

    public Barman(String nom, String nomDeBar) {
        super(nom, "wine");
        this.nomDeBar = nomDeBar;
    }

    @Override
    public void presenter() {
        System.out.println("Bonjour, je m'appel  " + super.getNom() + "vous êtes les bienvenu au " + this.nomDeBar + " et j'aime boire de " + super.getBoisson() + FIN_DE_PHRASE);
    }

    @Override
    public void parle() {
        System.out.println("nom sde l'humain : " + super.getNom() + FIN_DE_PHRASE);
    }

    @Override
    public void boire(){
        System.out.println("Ah ! un bon verre de " + super.getBoisson() + FIN_DE_PHRASE);
    }

}

