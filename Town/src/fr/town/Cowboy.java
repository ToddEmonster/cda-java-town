package fr.town;


public class Cowboy extends Humain{
    private static int popularite;
    private String attitude = "vaillant";



    public Cowboy(String nom, String boisson){
        super(nom, boisson);
        this.attitude = attitude;



    }

    //method

    public void tirer(String brignand, Dame dame){
        System.out.println("Le " + this.attitude + " " + getNom() + " tire sur " + brignand);
        System.out.println("Pan ! Prends, ça rascal !");
        if(dame.isCaptive() == true ){
            System.out.println("Yeah Miss " + dame.getNom() + ", regarde comme je suis fort");
            dame.liberer(super.getNom());

        }
    }
    @Override
    public void presenter(){
        System.out.println("Bonjour, je m'appel " + getNom());
    }

}
