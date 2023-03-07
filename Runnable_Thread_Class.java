class MyRunnable1 implements Runnable{
    public void run() {
        int i = 0;
        while(i<5) {
            System.out.println("I am a thread 1 not a threat 2");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<5) {
            System.out.println("I am a thread 2 not a threat 1");
            i++;
        }
    }
}
public class Runnable_Thread_Class {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
