package Generic;
import java.util.ArrayList;

public class Example3 {
    public static void main(String[] args) {
        //Without Java Generics:
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add("Priyanshu Baral");
        arr.add(20.4);

//        int x = arr.get(0);  -->This produce an error
//        System.out.println(x);
        int x = (int) arr.get(0);
        System.out.println(x);

        //With Java Generics :

        ArrayList<Integer> arr1 = new ArrayList();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);

        int x1 = arr1.get(0);
        System.out.println(x);
    }
}
