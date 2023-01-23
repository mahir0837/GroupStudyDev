package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskMaxNumberInString {

    public static void main(String[] args) {

        String number = "1 2 3 4 50";
        String[] arr = number.split(" ");
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(Integer.parseInt(arr[i]));
        }
        System.out.println(arrayList);
        int maxNumber=Collections.max(arrayList);
        int minNumber=Collections.min(arrayList);
        int[]result={minNumber,maxNumber};
        System.out.println(Arrays.toString(result));
       

    }
}
