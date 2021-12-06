package fr.town;

public class Brigand extends Humain implements Hors_la_loi{

    private static int rapt;
    private String look = "mechant";
    private int recompense;
    private boolean prison;



    public Brigand(String nom, String boisson){
        super(nom, boisson);
        this.recompense = 100;
        this.prison = false;
        this.look = look;



    }
    //getter and setter


    public static int getRapt() {
        return rapt;
    }
    public  int getRecompense(){
        return recompense;
    }

    //Method

    public static void kidnapper(Dame dame){
        rapt++;
        System.out.println("Ah Ah ! " + dame.getNom() + ", tu es désormais mienne");
    }

    public void arreter(String cowboy){
        if(prison == false){
            prison = true;
            System.out.println("Damned, je suis fait, " + cowboy + " tu m'as eu !");
        }
    }

    public void reward(){
        recompense = this.recompense * rapt;
        System.out.println("la tête du bandit " + getNom() + " est mise à prix de " + recompense + "$");
    }

    @Override
    public void presenter(){
        System.out.println("Bonjour, je m'appel  " + getNom() + " le " + this.look + " et j'aime boire du " + getBoisson());
        System.out.println("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.rapt + " femmes");
        System.out.println("Ma tête est mise à prix " + recompense);

    }

    @Override
    public void coffrer(Cowboy c) {

    }



    @Override
    public void getRecompse() {

    }

    @Override
    public void parle(){
        System.out.println(super.getNom());
    }
}
