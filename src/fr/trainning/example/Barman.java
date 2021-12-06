package fr.trainning.example;

public class Barman extends Humain{

    private String nomBar;

    public Barman(String nom, String nomBar){
        super(nom, "Vin");
        this.nomBar = "Chez Momo";
    }

    public Barman(String nom){
        super(nom, "Vin");
    }

    @Override
    public void presenter(){
        System.out.println(this.nomBar + " vous trouverez toutes les boissons" + toc());
    }

    public String toc(){
        return " Coco.";
    }

}
