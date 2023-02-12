package codewars;

import java.util.Arrays;

public class Sequence{

  public static int[] reverse(int n){
    int[]arr=new int[n];
    for (int i = n,t=0; i > 0; i--,t++) {
      arr[t]=i;
    }
    System.out.println(Arrays.toString(arr));
    return arr;
  }

  public static void main(String[] args) {
    reverse(8);
  }

}