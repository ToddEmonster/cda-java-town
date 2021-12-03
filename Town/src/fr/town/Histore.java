package fr.town;

public class Histore {
    public static void main(String[] args) {

        Humain humain = new Humain("Billy", "l'eau");
        humain.parle();
        humain.presenter();
        humain.boire();

        Humain dame = new Dame("Louise", "Thé");
        dame.parle();
        dame.presenter();
        dame.boire();
        ((Dame)dame).kidnapper();
        ((Dame)dame).liberer();
       ((Dame)dame).habiller("blue");

       Humain brigand = new Brigand("Malcom", "Wiskey");
       brigand.parle();
       brigand.presenter();
       brigand.boire();
        ((Brigand)brigand).kidnapper("Louise");
        ((Brigand)brigand).kidnapper("Jeannine");

        ((Brigand)brigand).arreter("Billy");
        ((Brigand)brigand).reward();


    }
}
