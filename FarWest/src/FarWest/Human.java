package FarWest;

public class Human {

    protected String name;
    protected String boisson;

    public Human(String name) {
        this.name = name;
        this.boisson = "l'eau";
    }

    private String getName() {
        return this.name;
    }
    private String getBoisson() {
        return this.boisson;
    }

    public void presentation(){
        System.out.println("Enchanté, je m'appele " +getName()+", j'aime "+getBoisson());
    }

    public void speak() {
        System.out.println("Halte cowboys, j'ai soif, allons boire un coup");
    }

}
