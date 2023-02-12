package codewars;

public class MakeNegative {
    public static int makeNegative(final int x) {

        int x1 = 0;
        if (x <=0){
            x1=x;
        }else {
            x1=-x;
        }

        return x1; // Your code here.

    }

    public static void main(String[] args) {
        System.out.println(makeNegative(42));
    }
}
