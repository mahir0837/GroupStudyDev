package codewars;

import java.util.Arrays;

public class CreateAnArray {
    public static int[] between(int a, int b) {

        int[]arr=new int[b-a+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=a+i;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
    }//-2,-1,0,1,2
}
