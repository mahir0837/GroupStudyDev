package week01;

import java.util.ArrayList;
import java.util.Collections;

public class test {

    public static void main(String[] args) {

        int a=15;
        int b=360;
        ArrayList<Integer>number=new ArrayList<>();
        number.add(a);
        number.add(b);

        Collections.swap(number,0,1);
        a=number.get(0);
        b=number.get(1);
        System.out.println("a="+a+" b="+b);



 /*
        int a=15;
        int b=12;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a="+a+" b="+b);

  */
/*
        int a=15;
        int b=12;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a+" b="+b);

 */


    }

}
