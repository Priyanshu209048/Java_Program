package Gregorian_Calender;

import java.util.GregorianCalendar;

public class Leap_Year {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.isLeapYear(2002));
    }
}
