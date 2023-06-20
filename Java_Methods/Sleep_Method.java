package Java_Methods;
import java.lang.Thread;

class myThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<100000){
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class myThr2 extends Thread{
    public void run(){
        int i = 0;
        while(i<100000){
           System.out.println("My Thank you: ");
           i++;
        }
    }
}

public class Sleep_Method {
    public static void main(String[] args){
        myThr1 t1 = new myThr1();
        myThr2 t2 = new myThr2();
        t1.start();
        t2.start();
    }
}
