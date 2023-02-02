package week01.Exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParseException {

    public static void main(String[] args) {
        String date1 ="27-01-2023";
        DateTimeFormatter df = DateTimeFormatter .ofPattern("DD-MMM-YYYY");
        LocalDate d1 = LocalDate.parse(date1, df);
        System.out.println(d1);



    }
}
