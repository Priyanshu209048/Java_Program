import java.util.Scanner;

public class Recursion_Factorial {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){
                product*=i;
            }
            return product;
        }
}
    public static void main(String[] args) {
        System.out.print("Write a number whose factorial we want to print: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The factorial of "+a+" is "+factorial(a));
        System.out.println("The factorial of "+a+" is "+factorial_iterative(a));
    }
}
