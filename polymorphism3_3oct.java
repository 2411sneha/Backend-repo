import java.lang.String;

class Shape
{
    public void draw()
    {
        System.out.println("drawing...");
    }
}
class Rectangle extends Shape
{
    public void draw(int l,int b)
    {
        
        System.out.println("drawing rectangle..."+(l*b));
    }
}
class Circle extends Shape
{
    public void draw(double r)
    {
        
        System.out.println("drawing circle..."+r);
    }
}

public class polymorphism3_3oct
{
    public static void main(String[] args)
    {
        Shape s=new Rectangle();
        int l,b;
        
        Shape t=new Circle();
        double r;
        s.draw();
    }
}