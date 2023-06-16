package Gregorian_Calender;

import java.util.GregorianCalendar;

public class hashcode_Method {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Calender: "+ gc.getTime());

        System.out.println("The hashcode for this calender is: "+ gc.hashCode());
    }
}
