package DateAndTime;
import java.util.*;
public class DateClass1 {
    public static void main(String[] args) {
        //Constructor
        Date d = new Date();
        System.out.println("The current date is : " + d);
        Date d1= new Date(1661686996787l);
        System.out.println("The date calculated form milliseconds is : " + d1);

        //Methods
        //compareTo()
        Date d2= new Date(2022,8, 28);
        System.out.println(d1.compareTo(d));

        //getTime()
        Date d3 = new Date(2022,8,23);
        System.out.println("The number of milliseconds passed since Jan 1, 1970 :" +d.getTime() );

        //getTime(), getDate()
        System.out.println(d.getTime());
        System.out.println(d.getDate());
    }
}
