package fr.town;

public class Histore {
    public static void main(String[] args) {

        Humain humain = new Humain("Billy", "eau");
        humain.parle();
        humain.presenter();
        humain.boire();

        Cowboy cowboy = new Cowboy("Davy", "Whisky");

        Dame dame1 = new Dame("Louise", "Thé");
        Dame dame2 = new Dame("Jeannine", "tysanne");
        dame1.parle();
        dame1.presenter();
        dame1.boire();
        dame1.kidnapper();
       dame1.habiller("blue");

       Brigand brigand = new Brigand("Malcom", "Tord-boyaud");
       brigand.parle();

       brigand.boire();
        brigand.kidnapper(dame1.getNom());
        brigand.kidnapper(dame2.getNom());
        brigand.reward();
        brigand.presenter();
        brigand.arreter(cowboy.getNom());




        cowboy.parle();
        cowboy.presenter();
        cowboy.boire();
        cowboy.tirer(brigand.getNom(), dame1);


    }
}
