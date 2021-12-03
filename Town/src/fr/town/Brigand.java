package fr.town;

public class Brigand extends Humain{

    private String look = "mechant";
    private static int rapt;
    private int recompense;
    private boolean prison;

    public Brigand(String nom, String boisson){
        super(nom, boisson);
        this.recompense = 100;
        this.prison = false;
        this.look = look;
    }

    //Method
    public void kidnapper(String nom){
        rapt++;
        System.out.println("Ah Ah ! " + nom + ", tu es désormais mienne");
    }

    public void arreter(String nom){
        if(prison == false){
            prison = true;
            System.out.println("Damned, je suis fait, " + nom + " tu m'as eu !");
        }
    }

    public void reward(){
        recompense = this.recompense * rapt;
        System.out.println("la tête du bandit " + getNom() + " est mise à prix de " + recompense + "$");
    }

}
