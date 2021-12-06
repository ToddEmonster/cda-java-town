package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class Madam extends Human{

    private String[] colors = {"orange", "blanc", "rouge", "bleue", "noire"};
    private String dressColor;
    private String LibertyState;

    public Madam(String name, String boisson){
        super(name);
        this.boisson = boisson;
        this.dressColor = colors[ThreadLocalRandom.current().nextInt(0, 4+1)];
    }

    public void setLibertyState(String libertyState) {
        LibertyState = libertyState;
    }

    protected String changeDress(){
        return this.name + " -- Regardez ma nouvelle robe "+ colors[ThreadLocalRandom.current().nextInt(0, 4+1)];
    }

    public void kidnapped() {
        System.out.println(this.name + " -- AAAAHHHHHHHHHHHHH OSKOOOUUURRRRRRRR");
        this.LibertyState = "captive";
    }

}
