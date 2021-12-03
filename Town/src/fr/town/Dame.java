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


    // Method
    public void kidnapper(){
        captive = true;
        System.out.println(" Hiiiiiiiiiiiiiiiii!!!!!!!");
    }

    public void liberer(){
        if(captive == true) {
            System.out.println("Merci gentil cowboy");
            captive = false;
        }
    }

    public void habiller(String colorDress){

        System.out.println("Regareder ma nouvelle robe de couleur " + colorDress);
    }


}
