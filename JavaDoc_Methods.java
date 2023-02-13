/**
 * This is the javadoc_Method class
 */
public class JavaDoc_Methods {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }
    //-->/*Is used for comment
    //--> /** Is used for javadoc comment

    /**
     * Hello this is the method of addition
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i+j;
        return c;
    }
}
