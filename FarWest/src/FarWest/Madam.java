package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class Madam {

    private String[] colors = {"orange", "blanc", "rouge", "bleue", "noire"};
    private String dressColor;
    private String LibertyState;

    public Madam(){
       this.dressColor = colors[ThreadLocalRandom.current().nextInt(0, 4+1)];
    }

    public void changeDress(){

    }

    public void kidnapped() {
        System.out.println("AAAAHHHHHHHHHHHHH OSKOOOUUURRRRRRRR");
        this.LibertyState = "captive";
    }

}
