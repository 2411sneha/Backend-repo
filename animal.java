import java.util.*;
import java.lang.String;

public class animal
{
    public void eat()
    {
        System.out.println("eating...");
    }
}
public class dog extends animal
{
    public void eat()

    {
        System.out.println("eating bread...");

    }
}
public class testPolymorphism_3oct
{
    public static void main(String[] args)
    {
        animal a=new dog();
        a.eat();
    }
}