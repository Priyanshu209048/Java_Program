import java.util.Random;
import java.util.Scanner;

class Game{
    private int num, inputNum, noOfGuesses = 0;
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.num = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNum == num){
            System.out.println("Yes you guess it right, it was "+num+" \nYou guessed it in "+noOfGuesses+" attempts");
            return true;
        }
        else if (inputNum<num){
            System.out.println("To Low...");
        }
        else if (inputNum>num){
            System.out.println("To High...");
        }
        return false;
    }
}

public class Guess_The_Number_Game {
    public static void main(String[] args) {
        Game g = new Game();
        while(true){
            g.takeUserInput();
            boolean b = g.isCorrectNumber();
        }
    }
}
