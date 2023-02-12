package codewars;

import java.util.Arrays;

public class CountPositivesSumNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int negative = 0;
        int[] newArr = new int[2];
        if (input!=null&&input.length!=0) {
            for (int i : input) {

                if (i > 0) {
                    count++;
                } else if (i < 0) {
                    negative += i;
                }

            }
            newArr[0] = count;
            newArr[1] = negative;
            return newArr;
        }


        return new int[]{};
    }

    public static void main(String[] args) {
      System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1,2,3,-5,-6})));
//        countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14});
    }
}
