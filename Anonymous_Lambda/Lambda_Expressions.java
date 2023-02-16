package Anonymous_Lambda;

@FunctionalInterface
interface Lambda{
    void meth1(int a, int b);
}

public class Lambda_Expressions {
    public static void main(String[] args) {
        Lambda obj = (a,b)->{
            System.out.println("The value of a and b is: "+a+", "+b);
        };
        obj.meth1(1,2);
    }
}
