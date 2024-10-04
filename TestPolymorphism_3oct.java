import java.lang.String;
class Animal
{  
    public  void eat(){  
        System.out.println("eating..."); 

    }  

    public  void add(int a,int b){  
        System.out.println("Addition = "+(a+b)); 
         
    }  
}  
 


class Dog extends Animal  
{  
    public  void eat()  
    {  
        System.out.println("eating bread...");  
    }  

    public  void add(int a,int b){  
        System.out.println("Multiplication = "+(a*b)); 
         
    }  
      
}  
public class TestPolymorphism_3oct 
{  
    public static void main(String[] args)  
    {  
        Animal a= new Dog();  
        a.eat();  
        int n1=5,n2=3;
        a.add(n1,n2);
    }  
}  


/*
eating bread...
Multiplication = 15
 */