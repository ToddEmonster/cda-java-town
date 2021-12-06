package fr.trainning.example;

public class Humain {

    private String nom;
    private String boisson;

    public Humain(String nom, String boisson) {
        this.nom = nom;
        this.boisson = "eau";
    }

    public void parle(String message){
        System.out.println(this.nom  + " dit: " + message);
    }

    public void presenter(){
        if(this.boisson == "eau"){
            System.out.println("Bonjour, je suis " + this.nom + " et j'aime l'" + this.boisson);
        }
        else {
            System.out.println("Bonjour, je suis " + this.nom + " et j'aime le " + this.boisson);
        }
    }

    public void boire(){
        if(this.boisson == "eau"){
            System.out.println("Ah ! un bon verre d'" + this.boisson + " ! GLOUPS !");
        }
        else {
            System.out.println("Ah ! un bon verre de " + this.boisson + " ! GLOUPS !");
        }
    }

    // Getters
    public String quel_est_ton_nom(){
        return this.nom;
    }

    public String quel_est_ta_boisson(){
        return this.boisson;
    }
}