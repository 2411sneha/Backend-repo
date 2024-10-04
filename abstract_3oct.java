import java.lang.String;
import java.util.*;
abstract class area
{
    abstract void cal_area();
    abstract void cal_vol();
}
class circle extends area
{
    double r,A,V;
    circle(double r)
    {
        this.r=r;
        this.A=A;
        this.V=V;
    }
    public void cal_area()
    {
        A=3.14*r*r;
        System.out.println("Area="+A);
    }
    public void cal_vol()
    {
        V=(4/3)*3.14*r*r*r;
        System.out.println("Volume="+V);
    }
}
class cone extends area
{
    double r,h,A,V;
    cone(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    public void cal_area()
    {
        A=3.14*r*(r+h);
        System.out.println("Area="+A);
    }
    public void cal_vol()
    {
        V=(1/3)*3.14*r*r*h;
        System.out.println("Volume="+V);
    }
}
class cylinder extends area
{
    double r,h,A,V;
    cylinder(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    public void cal_area()
    {
        A=2*3.14*r*h+2*3.14*r*r;
        System.out.println("Area="+A);
    }
    public void cal_vol()
    {
        V=3.14*r*r*h;
        System.out.println("Volume="+V);
    }
}
class sphere extends area
{
    double r,A,V;
    sphere(double r)
    {
        this.r=r;
        this.A=A;
        this.V=V;
    }
    public void cal_area()
    {
        A=4*3.14*r*r;
        System.out.println("Area="+A);     
    }
    public void cal_vol()
    {
        V=(4/3)*3.14*r*r;
        System.out.println("Volume="+V);
    }
}
class box extends area
{
    double l,w,h,A,V;
    box(double l,double w,double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }
    public void cal_area()
    {
        A=2*l*w+2*h*w+2*l*h;
        System.out.println("Area="+A);
    }
    public void cal_vol()
    {
        V=l*w*h;
        System.out.println("Volume="+V);
    }
}

public class abstract_3oct
{
    public static void main(String[] args) 
    {
        double r,h,l,w;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r=");
        r=sc.nextDouble();
        circle c1=new circle(r);
        c1.cal_area();
        c1.cal_vol();
        System.out.println("enter h=");
        h=sc.nextDouble();
        cone c2=new cone(r,h);
        c2.cal_area();
        c2.cal_vol();
        cylinder c3=new cylinder(r,h);
        c3.cal_area();
        c3.cal_vol();
        sphere s=new sphere(r);
        s.cal_area();
        s.cal_vol();
        System.out.println("enter w=");
        w=sc.nextDouble();
        System.out.println("enter l=");
        l=sc.nextDouble();
        box b=new box(l,w,h);
        b.cal_area();
        b.cal_vol();
    }
}