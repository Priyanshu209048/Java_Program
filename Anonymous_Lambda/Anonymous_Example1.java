package Anonymous_Lambda;

abstract class Vehicle{
    abstract void drive();
}

public class Anonymous_Example1 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(){
            @Override
            void drive(){
                System.out.println("I am driving a car.");
            }
        };
        car.drive();
    }
}
