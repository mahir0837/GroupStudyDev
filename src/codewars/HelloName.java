package codewars;

public class HelloName {

    public static String greet(String name) {

       String hello = "Hello, "+name+ " how are you doing today?" ;
       return hello;
    }


    public static void main(String[] args) {
        System.out.println(greet("Mahir"));
    }
}
//Make a function that will return a greeting statement that uses an input;
// your program should return, "Hello, <name> how are you doing today?".