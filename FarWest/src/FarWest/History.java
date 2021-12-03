package FarWest;

import java.util.concurrent.ThreadLocalRandom;

public class History {


    public static void main(String[] args) {
        Brigand brigand1 = new Brigand("Quentin", "la binouze");
        Madam madam1 = new Madam("Karima", "la soupe");
        CowBoy cowBoy1 = new CowBoy("sebastien luke", "le YOP");

        System.out.println(brigand1.presentation());
        System.out.println(madam1.presentation());
        System.out.println(madam1.changeDress());
        System.out.println(brigand1.kidnaping(madam1));
        System.out.println(cowBoy1.information(brigand1));
        boolean tmp = true ;
        while (cowBoy1.choice(brigand1, tmp)==false){
            brigand1.setReward(10000);
            System.out.println(cowBoy1.falseChoice());
            System.out.println(brigand1.showReward());
        }
        System.out.println(cowBoy1.trueChoice());
        System.out.println(cowBoy1.shoot(brigand1));
        System.out.println(brigand1.arrested(cowBoy1));
        System.out.println(cowBoy1.liberate(madam1));
        System.out.println(madam1.changeDress());
    }
}
