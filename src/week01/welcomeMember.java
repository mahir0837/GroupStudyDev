package week01;

import java.util.Arrays;

public class welcomeMember {

    public static void sayWelcome(String[]name,String city,String state){

        System.out.println("Hello, "+(Arrays.toString(name).replace(",",""))
                .replace("[","").replace("]","") +"! Welcome to "+
                city+" "+state+"!");
    }

    public static void main(String[] args) {
        sayWelcome(new String[]{"John", "Smith"}, "Phoenix", "Arizona");
    }
}
