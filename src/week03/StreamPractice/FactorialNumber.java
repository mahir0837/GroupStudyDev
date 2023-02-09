package week03.StreamPractice;

import java.util.stream.LongStream;

public class FactorialNumber {


    public static long factorialStreams(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    public static void main(String[] args) {
        System.out.println(factorialStreams(5));
    }
}
