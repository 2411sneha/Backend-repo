

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("eating bread...");
    }

}

public class polymorphism1 {
    public static void Main() {
        Dog a = new Dog();
        a.eat();
    }
}
