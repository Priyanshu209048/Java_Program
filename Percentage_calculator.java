import java.util.Scanner;

public class Percentage_calculator {
    public static void main(String[] args) {
        float English, Hindi, Maths, Science, S_Science;
        float Total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of all subject: ");
        System.out.print("English: ");
        English = sc.nextFloat();
        System.out.print("Hindi: ");
        Hindi = sc.nextFloat();
        System.out.print("Maths: ");
        Maths = sc.nextFloat();
        System.out.print("Science: ");
        Science = sc.nextFloat();
        System.out.print("S_Science: ");
        S_Science = sc.nextFloat();

        System.out.print("\n");
        System.out.println("********-Here we got the Result-********");

        System.out.println("English: "+English);
        System.out.println("Hindi: "+Hindi);
        System.out.println("Maths: "+Maths);
        System.out.println("Science: "+Science);
        System.out.println("S_Science "+S_Science);

        Total = English+Hindi+Maths+Science+S_Science;
        System.out.println("Total Marks: "+Total);

        float Percent = (Total)/5;
        System.out.println("Your Percentage is: "+Percent);
        if(English<33 || Hindi<33 || Maths<33 || Science<33 || S_Science<33)
            System.out.println("Failed");
        else
            if (Percent >= 91.0) {
                System.out.println("GRADE: A" + "\n" + "PASSED");
            } else if (Percent >= 81.0 && Percent < 90.0) {
                System.out.println("GRADE: B" + "\n" + "PASSED");
            } else if (Percent >= 71.0 && Percent < 80.0) {
                System.out.println("GRADE: C" + "\n" + "PASSED");
            } else if (Percent >= 51.0 && Percent < 70.0) {
                System.out.println("GRADE: D" + "\n" + "PASSED");
            } else if (Percent >= 33.0 && Percent < 50.0) {
                System.out.println("GRADE: E" + "\n" + "PASSED");
            }
    }
}
