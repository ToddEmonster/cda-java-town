package fr.town;

public class Histore {
    public static void main(String[] args) {

        Humain humain = new Humain("Billy", "eau");
        humain.parle();
        humain.presenter();
        humain.boire();

        Humain cowboy = new Cowboy("Davy", "limonade");

        Humain dame1 = new Dame("Louise", "Thé");
        Humain dame2 = new Dame("Jeannine", "tysanne");
        dame1.parle();
        dame1.presenter();
        dame1.boire();
        ((Dame)dame1).kidnapper();
       ((Dame)dame1).habiller("blue");

       Humain brigand = new Brigand("Malcom", "Whiskey");
       brigand.parle();
       brigand.presenter();
       brigand.boire();
        ((Brigand)brigand).kidnapper(dame1.getNom());
        ((Brigand)brigand).kidnapper(dame2.getNom());

        ((Brigand)brigand).arreter(cowboy.getNom());
        ((Brigand)brigand).reward();



        cowboy.parle();
        cowboy.presenter();
        cowboy.boire();
        ((Cowboy)cowboy).tirer(brigand.getNom(), ((Dame)dame1));


    }
}
