package fr.town;


public class Dame extends Humain{
    private String colorDress;
    private boolean captive;


    public Dame(String nom, String boisson){
        super(nom, boisson);
        this.captive = false;
        this.colorDress = colorDress;

    }

    public void setColorDress(){
        this.colorDress = colorDress;
    }
    //getter and setter


    public boolean isCaptive() {
        return captive;
    }

    // Method
    public void kidnapper(){
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


}
