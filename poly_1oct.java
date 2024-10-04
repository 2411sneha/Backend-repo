import java.util.Scanner;
import java.lang.String;

class area1
{
    double r,A;
    area1(double r)
    {
        this.r=r;
    }
    void cal_area()
    {
        A=3.14*r*r;
        System.out.println("Radius="+r+"\nArea="+A);
    }
}
class volume1 extends area1
{
    double h,v;
    volume1(double r,double h)
    {
        super(r);
        this.h=h;
    }
    void cal_area()
    {
        super.cal_area();
        v=A*h;
        System.out.println("H="+h+"\n volume="+v);
    }
}
public class poly_1oct
{
    public static void main(String[] args)
    {
        double r,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r nad h=");
        r=sc.nextDouble();
        h=sc.nextDouble();
        volume1 v1=new volume1(r,h);
        v1.cal_area();
    }
}

/*
enter r nad h=
5
6
Radius=5.0
Area=78.5
H=6.0
 volume=471.0
 */