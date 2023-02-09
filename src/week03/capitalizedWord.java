package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class capitalizedWord {

    public static String capitalizedWord(String word){

        if (word==null||word.isEmpty()){
           return "";
        }

        String result="";
        List<String> arr = Arrays.stream(word.split(" ")).
                map(p->p.substring(0,1).toUpperCase()+p.substring(1).toLowerCase()).collect(Collectors.toList());
        for (int i = 0; i < arr.size(); i++) {
            result+=arr.get(i)+" ";
        }

return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizedWord("how can mirrors be real if our eyes aren't real"));
    }
}
