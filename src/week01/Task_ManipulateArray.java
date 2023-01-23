package week01;

import java.io.PrintStream;
import java.util.Arrays;

public class Task_ManipulateArray {


    public static void main(String[] args) {

        int[] myArray = new int[3];
        int count = 0;
        for (int each : myArray) {

            if (each == 0) {

                myArray[count] = 5;
                count++;
            }
        }


        System.out.println(Arrays.toString(myArray));
    }
}
