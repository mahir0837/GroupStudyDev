package week01.Exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseException {




    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
        Date d= new Date();
        String date="2023/01/07";
        try {
            System.out.println(sdf.parse(date));
        } catch (java.text.ParseException e) {
            e.printStackTrace();

        }
        System.out.println(sdf.format(d));


    }
}
