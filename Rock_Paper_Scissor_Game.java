import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Choose number of rounds you want to play: ");
        int n = sc.nextInt();
        int u=0;
        int c=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
            int user = sc.nextInt();
            int computer = random.nextInt(3);
            if (user == computer) {
                System.out.println("Match Draw");
            }
            else if (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
                System.out.println("Computer Win!");
                c++;
            }
            else if (user == 1 && computer == 0 || user == 2 && computer == 1 || user == 0 && computer == 2) {
                System.out.println("You Win!");
                u++;
            } else {
                System.out.println("Wrong Choice!");
            }
            if (computer == 0){
                System.out.println("Computer choice is Rock");
            }
            else if (computer == 1) {
                System.out.println("Computer choice is Paper");
            }
            else {
                System.out.println("Computer choice is Scissor");
            }
        }
        if (c>u){
            System.out.println("Computer win this match with "+c+" points");
        }
        else if(c<u){
            System.out.println("You win this match with "+u+" points");
        }
        else {
            System.out.println("Match Draw");
        }
    }
}
