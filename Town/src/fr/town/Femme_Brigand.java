package fr.town;

public class Femme_Brigand extends Dame implements Hors_la_loi{
        private String attitude = "Bad Ass";

    public Femme_Brigand(String nom, String Attitude){
        super(nom, "Absynthe");
        this.attitude = attitude;

    }

    public void habiller(String colorDress){

        System.out.println("Regader les nouveaux flingues qe je me suis acheté ce sont des : " + colorDress);
    }

    @Override
    public void coffrer(Cowboy c) {

    }

    @Override
    public void getRecompse() {

    }

}
