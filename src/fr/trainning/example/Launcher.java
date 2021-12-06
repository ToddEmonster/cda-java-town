package fr.trainning.example;

public class Launcher {

    public static void main(String[] args) {
        Dames dame = new Dames("Barbara", "rose fushia");
        Brigand brigand = new Brigand("Bob", "méchant");
        Cowboys cowboys = new Cowboys("Clint", 0);
        Barman barman = new Barman("Lopez", "");
        Sherif sherif = new Sherif("Domingo",0);
        Cowboys clint = new Sherif("Clint", 0);

        /*int recompenseBrigand = brigand.capture(brigand);
        System.out.println("La récompense de ce brigand est de " + recompenseBrigand + "$");

        cowboys.libererDame(dame);
        System.out.println(brigand.quel_est_ton_nom());*/

        //barman.presenter();

        //sherif.affiche(brigand);
    }
}