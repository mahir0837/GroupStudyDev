package codewars;

public class FirstConsecutiveNumber {

    static Integer find(final int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {

                if (array[i] != array[i + 1] - 1) {
                    number = array[i + 1];
                    return number;

                }

            }

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 10}));
    }
}
