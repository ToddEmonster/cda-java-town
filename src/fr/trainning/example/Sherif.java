package fr.trainning.example;

public class Sherif extends Cowboys {

    public Sherif(String nom, int popularite) {
        super(nom, popularite);
    }

    public void coffrer(Brigand brigand){
        System.out.println("Au nom de la loi, je vous arrête !");
    }

    public void affiche(Brigand brigand){
        System.out.println("OYEZ OYEZ BRAVE GENS !! " + brigand.capture(brigand) + " $ à qui arretera " + brigand.quel_est_ton_nom() + " mort ou vif !!");
    }


}
