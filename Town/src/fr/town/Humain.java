package fr.town;

public class Humain {

    private String nom;
    private String boisson;


    public Humain(String nom){
        this.nom= nom;
        this.boisson = boisson;
    }

    public Humain(String nom, String boisson) {
        this.nom = nom;
        this.boisson = boisson;
    }

    //gettter and setter


    public String getNom() {
        return nom;
    }



    public String getBoisson() {
        return boisson;
    }

    public void setBoisson(String boisson) {
        this.boisson = boisson;
    }

    // Methode
    public void parle(){
        System.out.println(this.nom);
    }

    public void presenter(){
        System.out.println("Bonjour, je m'appel " + this.nom + " et j'aime boire de " + this.boisson);
    }
    public void boire(){
        System.out.println("Ah ! un bon verre de " + this.boisson);
    }
}
