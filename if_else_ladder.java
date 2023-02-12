import java.util.Scanner;

public class if_else_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i<10){
            System.out.println("i is less then 10");
        }
        else if(i<15){
            System.out.println("i is less than 15");
        }
        else if(i<=20){
            System.out.println("i is greater than "+"or equal to 20");
        }
        else{
            System.out.println("Outside the if-else statement");
        }
    }
}