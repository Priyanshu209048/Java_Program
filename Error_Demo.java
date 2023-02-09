import java.util.Scanner;

public class Error_Demo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 6; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 and 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(k/0);
    }
}
