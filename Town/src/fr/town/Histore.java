package fr.town;

public class Histore {
    public static void main(String[] args) {

        Humain humain = new Humain("Billy", "eau");
        humain.parle();
        humain.presenter();
        humain.boire();

        Ripoux ripoux = new Ripoux("Trevors","vodka");
        Sherif sherif = new Sherif("Sherif Jones", "honnête");
        Cowboy cowboy = new Cowboy("Davy", "Whisky");
        Barman barman = new Barman("Jack", "Hat Jack's");

        Dame dame1 = new Dame("Louise", "Thé");
        Dame dame2 = new Dame("Jeannine", "tysanne");
        Dame jane = new Femme_Brigand("Calamity Jane", "Bad Ass");
        dame1.parle();
        dame1.presenter();
        dame1.boire();
        dame1.enlever();
       dame1.habiller("blue");

       jane.parle();
       jane.presenter();
       jane.boire();
       jane.habiller("clot Smith et Wesson 45");


       Hors_la_loi brigand = new Brigand("Malcom", "Tord-boyaud");
       brigand.parle();

        ((Brigand)brigand).boire();
        ((Brigand)brigand).kidnapper(dame1);
        ((Brigand)brigand).kidnapper(dame2);
        ((Brigand)brigand).reward();
        ((Brigand)brigand).presenter();
        ((Brigand)brigand).arreter(cowboy.getNom());

        barman.parle();
        barman.boire();
        barman.presenter();

        sherif.parle();



        sherif.traquer((Brigand)brigand);
        sherif.tirer(((Brigand) brigand).getNom(), dame1);
        sherif.coffrer((Brigand)brigand);

        sherif.presenter();

        ripoux.parle();
        ripoux.boire();
        ripoux.kidnapper(dame2);
        ripoux.coffrer(cowboy);
        ripoux.presenter();






    }
}
