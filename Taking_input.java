import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number for addition: ");
        System.out.print("number 1: ");
        int a = sc.nextInt();
        System.out.print("number 2: ");
        float b = sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of to number is: "+sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        /*String str = sc.next();
        System.out.println(str);
        String str1 = sc.nextLine();
        System.out.println(str1);*/
    }
}