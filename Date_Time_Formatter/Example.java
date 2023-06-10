package Date_Time_Formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is: "+dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyy");

        String myDate = dt.format(df);
        System.out.println("Date after formatting: "+myDate);
    }
}
