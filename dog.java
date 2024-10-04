import java.util.*;
import java.lang.String;
import java.util.Scanner;

 class Animal
{
    public void eat()
    {
        System.out.println("eating...");
    }
}
 class dog extends animal
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
        Animal a=new dog();
        a.eat();
    }
}