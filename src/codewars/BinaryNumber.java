package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryNumber {
    public static int binToDecimal(String inp){
        // your code here

        String result = "";
        int number=0;
        for (int i = 0; i < inp.length(); i++) {
            result=Integer.toBinaryString(inp.charAt(i));
            number= Integer.parseInt(result);
//            String[] arr=result.split("");
//            number= Integer.parseInt(arr[arr.length-1]);
        }

       return number;
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("73"));
    }
}
