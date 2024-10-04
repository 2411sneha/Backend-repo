import java.lang.String;
import java.util.Scanner;

class poly1
{
    double l,b,A,r,h;
    void cal_area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l and b=");
        l=sc.nextDouble();
        b=sc.nextDouble();
        A=l*b;
        System.out.println("Area of rectangle="+A);
    }
    void cal_area(double r)
    {
        this.r=r;
        A=3.14*r*r;
        System.out.println("Area of circle="+A);
    }
    double cal_area(double b,double h)
    {
        this.b=b;
        this.h=h;
        A=0.5*b*h;
        return(A);
    }
}
public class area_1oct
    {
        public static void main(String[] args) 
        {
            double r,h,b;
            Scanner sc=new Scanner(System.in);
            poly1 v1=new poly1();
            v1.cal_area();
            System.out.println("Enter r");
            r=sc.nextDouble();
            v1.cal_area(r);
            System.out.println("enter b and h=");
            b=sc.nextDouble();
            h=sc.nextDouble();
            double A=v1.cal_area(b, h);
            System.out.println("Area="+A);
        }
    }


    /*
     * Enter l and b=
5
6
Area of rectangle=30.0
Enter r
5
Area of circle=78.5
enter b and h=
6
3
Area=9.0
     */