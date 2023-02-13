/**
 * This class is used to demonstrate that what is javadoc and how is it used int the java industry.
 * This is <i>Italic</i> word<p>This is a new paragraph</p>
 * @author Priyanshu (CodingWithPriyanshu)
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html"><b>Java Docs</b></a>
 */
public class java_docs {
    /** This method is used to return the division of two numbers
     * @throws ArithmeticException if divided by 0
     * @return Integer
     * @param a First parameter -  Integer
     * @param b Second parameter - Integer
     * */
    public static int divide(int a, int b){
        return a/b;
    }

    /** This is the main method and we call the divide function
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(divide(2,3));
    }
}
