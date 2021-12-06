package fr.town;

public class Sherif extends Cowboy{
    public static int arretstation = 0;
    private String attitude = "Honnêtes";


    public Sherif(String nom, String attitude){
        super(nom, "vodka");
        this.attitude = attitude;
    }


    //Methode

    public void coffrer(Brigand brigand){
        if (Brigand.getRapt()> 0){
            arretstation++;
            System.out.println("Au nom de la loi, je vous arrête!");
        }
    }

    public static void traquer(Brigand brigand){
        if (Brigand.getRapt()>0){
            System.out.println("OYEZ OYEZ BRAVE GENS !!" + (brigand.getRecompense()) + "$ a` qui arretera " + brigand.getNom() + " le brigand mort ou vif !!");
        }

    }

    @Override
    public void presenter(){
        System.out.println("Bonjour, je m'appel " + getNom() + " je suis " + this.attitude + " et j'ai attrapé " + arretstation + " brigand");
    }

}
