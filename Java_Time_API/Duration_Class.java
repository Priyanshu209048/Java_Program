package Java_Time_API;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_Class {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);
        System.out.println(d1.isNegative());
        System.out.println(d1.isZero());

        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.NOON);
        System.out.println(d2.isNegative());
        System.out.println(d2.isZero());
    }
}
