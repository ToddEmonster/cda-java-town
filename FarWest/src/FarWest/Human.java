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

    protected  String presentation(){
        return "Enchanté, je m'appele " +getName()+", j'aime "+getBoisson();
    }

    protected String talk(String text){
        return this.name + " -- " + text;
    }

    protected String speak() {
        return "Halte cowboys, j'ai soif, allons boire un coup";
    }


}
