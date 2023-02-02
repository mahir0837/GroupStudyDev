package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskMaxNumberInString {

    public static void main(String[] args) {

        //String number = "1 2 -30 40 5";
        String number = "1 2 3 4 50";
        String[] arr = number.split(" ");
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(Integer.parseInt(arr[i]));
        }
        int maxNumber=Collections.max(arrayList);
        int minNumber=Collections.min(arrayList);
        int[]result={minNumber,maxNumber};
        System.out.println(Arrays.toString(result));
       

    }
    /*
    You are given a string of space separated numbers, write a method that returns the highest and lowest number as an int array. The smaller should be the first element of the array.

Example 1:
Input: "1 2 3 4 50"
Output: [1,50]
Explanation: In the given string the smallest number is 1 and the highest is 50, so we return an int array whose first element is 1 and second element is 50.

Example 2:
Input: “1 2 -30 40 5”
Output: [-30,40]

     */
}
