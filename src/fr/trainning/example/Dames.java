package fr.trainning.example;

public class Dames extends Humain {

    private String couleurRobe;
    private Boolean etat;

    public Dames(String nom, String couleurRobe){
        super(nom, "lait");
        this.couleurRobe = couleurRobe;
        this.etat = false;
    }

    public void kidnapper(){
        System.out.println("AHHHHHHHHHHHH !!!!");
    }

    public void liberer(){
        System.out.println("Merci de m'avoir sauvé");
    }

    public void changerRobe(String couleurRobe) {
        this.couleurRobe = couleurRobe;
        System.out.println("Regardez ma nouvelle robe " + couleurRobe);
    }

    public String getCouleurRobe(){
        return this.couleurRobe;
    }

    @Override
    public String quel_est_ton_nom(){
        return "Miss " + super.quel_est_ton_nom();
    }

}