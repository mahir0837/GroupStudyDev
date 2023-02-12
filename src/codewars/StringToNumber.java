package codewars;

public class StringToNumber {

  public static int stringToNumber(String str) {

    int num= Integer.parseInt(str);
    return num;
  }

  public static void main(String[] args) {
    System.out.println(stringToNumber("25"));
  }

}