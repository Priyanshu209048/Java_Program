interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface {
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface, sampleInterface{
    public void meth1(){
        System.out.println("This is meth1");
    }
    public void meth2(){
        System.out.println("This is meth2");
    }
    public void meth3(){
        System.out.println("This is meth3");
    }
    public void meth4(){
        System.out.println("This is meth4");
    }
}
public class Inheritance_in_Interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
