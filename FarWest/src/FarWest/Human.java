package FarWest;

public class Human {

    private String name;
    private String boisson = "eau";

    Human(String name, String boisson){
        this.name = name;
        this.boisson = boisson;
    }

    private void talk(String text){
        System.out.println(this.name + " "+text);
    }

    public String getName() {
        return name;
    }

    public String getBoisson() {
        return boisson;
    }
}
