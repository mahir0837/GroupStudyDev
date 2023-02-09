package week03;

import java.util.*;

public class countDuplicateChar {

    public static String CountDuplicate(String word) {
        int count = 0;
        Set<String> duplicateSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (String.valueOf(word.charAt(i)).equalsIgnoreCase((word.charAt(j) + ""))) {
                    count++;
                }
            }
            if (count > 1) {
                duplicateSet.add(("'" + word.charAt(i)) + "'" + " occurs " + count + " times");
            }
        }

        if (duplicateSet.isEmpty()) {
            System.out.println("0 # no characters repeats more than once");
            System.exit(0);
        }


        return duplicateSet.size() + "# " + duplicateSet.toString().replace("[", "").replace("]", "").replace(",", " and");
    }


    public static void main(String[] args) {

        System.out.println(CountDuplicate("ABBA"));
    }
}
