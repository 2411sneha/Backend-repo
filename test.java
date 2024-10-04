

class Animal {
    public void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("eating bread...");
    }

}

public class test bfhtm
{   
    public static void Main() {
        Animal a = new Dog();
        a.eat();
    }
    
}
