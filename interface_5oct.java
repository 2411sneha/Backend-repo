import java.lang.String;
import java.util.*;

interface shape
{
    
    abstract void area();
}
class circle implements shape
{
    final double pi=3.14f;
    double r,A;
    circle(double r)
    {
        this.r=r;
    }
    public void area()
    {
        A=pi*r*r;
        System.out.println("Area of circle="+A);
    }
}
class sphere implements shape
{
    final double pi=3.14f;
    double r,A;
    sphere(double r)
    {
        this.r=r;
    }
    public void area()
    {
        A=4*pi*r*r;
        System.out.println("Area of sphere="+A);
    }
}

public class interface_5oct
{
    public static void main(String[] args) 
    {
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of r=");
        r=sc.nextDouble();
        circle c=new circle(r);
        c.area();
        sphere s=new sphere(r);
        s.area();
    }
}