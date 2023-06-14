package Generic;
import java.util.*;

class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }
    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //arr.add("String"); //-->for this we have to use ArrayList arr = new ArrayList();
        arr.add(20);
        arr.add(10);
        int a = arr.get(0);
        System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric(23,"My string",10);
        Integer int1 = g1.getVal();
        String str = g1.getT1();
        Integer int2 = g1.getT2();
        System.out.println(int1+","+str+","+int2);
    }
}
