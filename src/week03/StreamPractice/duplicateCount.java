package week03.StreamPractice;

import java.util.HashSet;
import java.util.Set;
public class duplicateCount {

        public static int CountDuplicate(String word) {

            Set<String> duplicateSet = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
               int count = 0;

                for (int j = 0; j < word.length(); j++) {
                    if (String.valueOf(word.charAt(i)).equalsIgnoreCase((word.charAt(j) + ""))) {
                        count++;
                    }
                }
                if (count > 1) {
                    duplicateSet.add(String.valueOf(word.charAt(i)).toLowerCase() );
                }
            }
            if (duplicateSet.isEmpty()) {
                System.out.println("0 # no characters repeats more than once");
                System.exit(0);
            }

            return duplicateSet.size();
        }


        public static void main(String[] args) {

            System.out.println(CountDuplicate("Indivisibilities"));
        }
    }


