package week04;

public class Factorial {
/*
Write a method that returns the factorial number of any given number
 */
    public static int factorial(int number){

        int factorialnumber=1;
        for (int i = number; i > 0; i--) {
            factorialnumber*=i;
        }
        return factorialnumber;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
