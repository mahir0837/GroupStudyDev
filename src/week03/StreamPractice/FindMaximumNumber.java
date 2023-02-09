package week03.StreamPractice;

import java.util.ArrayList;

public class FindMaximumNumber {

    public static void main(String[] args) {

        int[]array={6,8,3,5,1,9};
        ArrayList<Integer>maxElement=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            maxElement.add(array[i]);
        }
        int output=maxElement.stream()
                .reduce(Integer::max).get();
        System.out.println("Max Number is "+output);
    }
}
