package codewars;

import java.util.LinkedHashMap;
import java.util.Map;

public class HowMuchILoveYou {
    public static String howMuchILoveYou(int nb_petals) {
        String[] arr = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        String result = "" ;

        int index=nb_petals%6;
        if (nb_petals > 0 && nb_petals <= 6) {

            result = arr[nb_petals - 1];
        } else if (nb_petals>6&&index!=0) {
            result = arr[index-1];
        }
        else if (nb_petals>6) {
            result = arr[index+5];
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(howMuchILoveYou(6));
    }
}
