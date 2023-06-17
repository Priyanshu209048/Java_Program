package Gregorian_Calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class roll_Method {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Date before rolling: "+ gc.getTime());

        gc.roll(GregorianCalendar.MONTH, true);
        gc.roll(Calendar.DATE, false);
        gc.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling: "+ gc.getTime());
    }
}
