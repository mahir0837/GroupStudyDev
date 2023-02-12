package codewars;

public class SquareSum {

    public static int squareSum(int[] n) {

        int number=0;
        int number1=0;
        for (int i = 0; i < n.length; i++) {
            number= (int) Math.pow(n[i],2);
            number1+=number;
        }

        return number1;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{5,-3,4}));
    }
}
