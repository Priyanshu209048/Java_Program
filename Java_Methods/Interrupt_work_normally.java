package Java_Methods;

class Interrupt2 extends Thread{
    public void run(){
        for (int i=0;i<10;++i){
            System.out.println(i);
        }
    }
}

public class Interrupt_work_normally extends Thread{
    public static void main(String[] args) {
        Interrupt2 t= new Interrupt2();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");
    }
}
