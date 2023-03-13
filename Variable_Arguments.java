public class Variable_Arguments {
    public static int box(int ...arr){      //public static int box(int x, int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Variable Arguments (VarArgs):");
        System.out.println("The sum of nothing is: "+box());           //If we use above comment function then atleast one integer is required and this statement will not work and shows error.
        System.out.println("The sum of 1 is: "+box(1));
        System.out.println("The sum of 4 and 5 is: "+box(4, 5));
        System.out.println("The sum of 2, 4 and 3 is: "+box(2, 4, 5));
        System.out.println("The sum of 2, 4, 3 and 5 is: "+box(2, 4, 3, 5));
    }
}
