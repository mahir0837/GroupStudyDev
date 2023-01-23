package week01;

import java.util.*;

public class foxPure {
    public String name;
    public boolean iswear;
    public boolean hasATorch;
    public String CoatColor;
    public int bag;

    public foxPure(String name, boolean iswear, boolean hasATorch, String coatColor, int bag) {
        this.name = name;
        this.iswear = iswear;
        this.hasATorch = hasATorch;
        CoatColor = coatColor;
        this.bag = bag;
    }

    public String getName() {
        return name;
    }

    public boolean isIswear() {
        return iswear;
    }

    public boolean isHasATorch() {
        return hasATorch;
    }

    public String getCoatColor() {
        return CoatColor;
    }

    public int getBag() {
        return bag;
    }

    public static void main(String[] args) {
        boolean fox1WearsCoat = true;
        boolean fox2WearsCoat = true;
        boolean fox3WearsCoat = true;
        boolean fox4WearsCoat = false;

        boolean fox1HasATorch = true;
        boolean fox2HasATorch = true;
        boolean fox3HasATorch = true;
        boolean fox4HasATorch = true;

        String fox1CoatColor = "BLACK";
        String fox2CoatColor = "BLACK";
        String fox3CoatColor = "BLACK";
        String fox4CoatColor = "GRAY";

        int fox1BagCount = 0;
        int fox2BagCount = 2;
        int fox3BagCount = 3;
        int fox4BagCount = 3;
        foxPure fox1 = new foxPure("Fox1",true, true, "BLACK", 0);
        foxPure fox2 = new foxPure("Fox2",true, true, "BLACK", 2);
        foxPure fox3 = new foxPure("Fox3",true, true, "BLACK", 3);
        foxPure fox4 = new foxPure("Fox4",false, true, "GRAY", 4);
        List<foxPure> foxList = new ArrayList<>();
        foxList.addAll(Arrays.asList(fox1,fox2,fox3,fox4));
        for (foxPure eachFox : foxList) {
           if (eachFox.hasATorch){
               if (eachFox.getBag()==3){
                   if (eachFox.getCoatColor().equals("BLACK")){
                       System.out.println("Thief fox is: "+eachFox.getName());
                   }
               }
           }
        }
    }

}
/*
 * We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
 * Luckily guard rooster have some info to identify the guilty fox.
 * Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
 * thief fox had a black coat, a torch and 3 bags.
 * Find the suspect foxes, if a fox is cleared of charges write that also
 */