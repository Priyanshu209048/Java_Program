package Java_Time_API;
import java.time.Clock;

public class Clock_Class {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());

        Clock c1 = Clock.systemDefaultZone();
        System.out.println(c1.instant());
    }
}
