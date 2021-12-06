package FarWest;

public class Barman extends Human {
    private String barName;

    public Barman(String name){
        super(name);
        this.boisson = "Vin";
    }
    public Barman(String name, String barName){
        super(name);
        this.barName = barName;
        this.boisson = "le Vin";
    }

    protected String talk(){
        return this.presentation() + ", venez dans mon bar le "+this.getBarName()+ ", Coco";
    }

    protected String getBarName() {
        return barName;
    }


}
