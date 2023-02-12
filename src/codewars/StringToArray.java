package codewars;

import java.util.Arrays;

public class StringToArray {

    public static String[] stringToArray(String s) {

       String[]arr= s.split(" ");
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    }
}
