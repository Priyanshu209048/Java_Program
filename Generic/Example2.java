package Generic;
import java.util.*;
public class Example2 {
    public static void main(String[] args) {
        //Without Java Generics:
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add("Priyanshu Baral");
        arr.add(20.4);
        System.out.println(arr);

        //With java Generics:
//        ArrayList<Integer>arr1 = new ArrayList();
//        arr1.add(10);
//        arr1.add("Priyanshu Baral");
//        arr1.add(20.4);
//        System.out.println(arr1);
        // This shows an error
    }
}
