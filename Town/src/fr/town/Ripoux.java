package fr.town;

public class Ripoux extends Sherif implements Hors_la_loi{

    private String attitude = "ripoux";
    public static int rapt;

    public Ripoux(String nom, String boisson){
        super(nom, "ripoux");
        this.attitude = attitude;
        this.rapt = rapt;

    }







    @Override
    public void coffrer(Cowboy c) {
        if (Brigand.getRapt()> 0){
            arretstation++;
            System.out.println("Au nom de la loi, " + c.getNom() + "je vous arrête!");
        }

    }


    public static void kidnapper(Dame dame){
        rapt++;
        System.out.println("Ah Ah ! " + dame.getNom() + ", tu es désormais mienne");
    }

    @Override
    public void getRecompse() {

    }



}
