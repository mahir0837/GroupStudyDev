import java.util.ArrayList;
import java.util.Collections;

public class nonRepatingVovels {

    public static int firstNonRepaitingVovel(String word) {

        boolean b;

        ArrayList<Character> ch = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            b = word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u';
            if (b) {
                ch.add(word.charAt(i));
            }
        }
        for (int i = 0; i < ch.size(); i++) {
            if (Collections.frequency(ch, ch.get(i)) == 1) {
                 int index=word.indexOf(ch.get(i));
                return index;
            }
        }

return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepaitingVovel("google"));
    }
}