abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){System.out.println("Rectangle class");}
}
class Circle1 extends Shape{
    void draw(){System.out.println("\n\n21BCS4999\nAbhishek Mishra\nSample code of Abstraction \n\n");}
}

class TestAbstraction1{
    public static void main(String args[]){
        Shape s=new Circle1();
        s.draw();
    }
}