class Base{
    private int a;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
class Derived extends Base{
    private int b;
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setA(10);
        d.setB(20);
        System.out.println(d.getA()+"\n"+d.getB());
    }
}
