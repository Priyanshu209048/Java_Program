public class Method_Overloading {
    static void box(){
        System.out.println("Good Afternoon!");
    }
    static void box(String a){
        System.out.println("Hello! "+a+", Nice to meet you.");
    }
    static int box(int a){
        System.out.println("Time: "+a+"pm");
        return 0;
    }
    static void box(String a, String b){
        System.out.println("Hello! "+a+", Nice to meet you.");
        System.out.println("Hello! "+b+", Nice to meet you.");
    }
    public static void main(String[] args) {
        box();
        box("Priyanshu");
        box(1);
        box("Abhishek", "Ashish");
    }
}
