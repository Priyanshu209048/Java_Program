package Java_Time_API;
import java.time.LocalDate;

public class Local_Date_Class {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate d1 = LocalDate.parse("2021-05-27");
        LocalDate d2 = LocalDate.parse("2021-05-26");
        LocalDate d3 = LocalDate.parse("2021-05-25");

        System.out.println(d2.equals(d1));
        System.out.println(d3.equals(d2));
        System.out.println(d1.withYear(2001));
    }
}
