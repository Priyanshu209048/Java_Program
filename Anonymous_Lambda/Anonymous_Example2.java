package Anonymous_Lambda;

@FunctionalInterface
interface Human{
    void walk();
}

public class Anonymous_Example2 {
    public static void main(String[] args) {
        Human Person = new Human() {
            @Override
            public void walk() {
                System.out.println("Person walks");
            }
        };
        Person.walk();
    }
}
