package Java_Annotatons;

@FunctionalInterface
interface myFunctionInterface{
    void method1();
    //void method2();
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 pm");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class Some_Annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        System.out.println(phone.sum(2,3));
    }
}
