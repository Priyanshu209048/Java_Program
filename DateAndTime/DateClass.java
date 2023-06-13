package DateAndTime;
import java.util.*;
public class DateClass{
    public static void main(String[] args) {
        Calendar d= Calendar.getInstance();
        Date d1 = new Date();
        System.out.println("The current date is : "+ d.get(Calendar.DAY_OF_MONTH));    //Deprecation replaced by
        System.out.println("The current date is : "+ d1.getDate());   //Deprecated
    }
}
