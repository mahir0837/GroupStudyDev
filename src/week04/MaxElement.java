package week04;

public class MaxElement {
/*
Write a function that can find the maximum number from an int Array.
 */
    public static int maxElementFromArray(int[]arr){

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(maxElementFromArray(new int[]{6, 8, 3, 5, 1, 9}));
    }
}
