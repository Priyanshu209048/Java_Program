import java.util.Scanner;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        System.out.println("Now enter values: ");
        int [][] matrix = new int[n][m];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
