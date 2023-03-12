import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Throw_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for division: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter radius: ");
        int z = sc.nextInt();
        try{
            int c = divide(x, y);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        try{
            double ar = area(z);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
