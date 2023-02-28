public class Output_format {
    public static void main(String[] args) {
        int a = 6;
        float b = 5.6454f;
        System.out.print("The value of a is "+a+" and value of b is "+b+"\n");
        System.out.println("The value of a is "+a+" and value of b is "+b);
        System.out.printf("The value of a is %d and value of b is %8.2f. ",a,b);
        System.out.format("\nThe value of a is %d and value of b is %8.2f. ",a,b);
    }
}
