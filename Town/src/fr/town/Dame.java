package fr.town;


public class Dame extends Humain{
    private String colorDress;
    private boolean captive;
    protected String boisson;



    public Dame(String nom, String boisson){
        super(nom, boisson);
        this.captive = false;
        this.colorDress = colorDress;

    }


    //getter and setter


    public boolean isCaptive() {
        return captive;
    }

    // Method
    public void enlever(){
        captive = true;
        System.out.println(" Hiiiiiiiiiiiiiiiii!!!!!!!");
    }

    public void liberer(String cowboy){
        if(captive == true) {
            System.out.println("Merci M. " + cowboy + " comme vous êtes fort");
            captive = false;
        }
    }

    public void habiller(String colorDress){

        System.out.println("Regareder ma nouvelle robe de couleur " + colorDress);
    }

    @Override
    public void presenter(){
        System.out.println("Bonjour, je m'appel Miss " + super.getNom() + " et j'aime boire de " + super.getBoisson());
    }

}
