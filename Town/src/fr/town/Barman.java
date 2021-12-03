package fr.town;

public class Barman extends Humain{
    private String nomDeBar;


    public Barman(String nom){
        super (nom);
        this.nomDeBar= nomDeBar;
    }

    public Barman(String nom, String boisson){
        super(nom, "wine");
        this.nomDeBar = nomDeBar;
    }


}
