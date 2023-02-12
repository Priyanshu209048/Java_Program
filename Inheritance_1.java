class Animal{
    public void Eating(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    public void Barking(){
        System.out.println("Barking...");
    }
}

public class Inheritance_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Eating();
        d.Barking();
    }
}
