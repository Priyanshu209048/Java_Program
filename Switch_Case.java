import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String size;

        switch (i){
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            case 44:
                size = "Large";
                break;
            case 48:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Size: "+size);
    }
}