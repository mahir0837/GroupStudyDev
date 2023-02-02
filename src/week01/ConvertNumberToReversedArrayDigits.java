package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConvertNumberToReversedArrayDigits {

    public static void main(String[] args) {

        System.out.println("Enter a number ");
        String number = new Scanner(System.in).nextLine();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            arrayList.add(Integer.parseInt(number.charAt(i) + ""));
        }
        Collections.reverse(arrayList);
        System.out.println(arrayList);


    }
}
