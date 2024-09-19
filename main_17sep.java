import java.util.Scanner;

class area
{
    double r,A;
    void accept(double r)
    {
        this.r=r;
    }
    double cal_area()
    {
        A=3.14*r*r;
        return(A);
    }
}
public class main_17sep 
{
    public static void main(String[] args)
    {
        double r,A;
        Scanner sc= new Scanner(System.in);
        area a1= new area();
        System.out.println("enter value of r=");
        r=sc.nextDouble();
        a1.accept(r);
        A=a1.cal_area();
        System.out.println("Area="+A);
    }
    
}

/*
 * enter value of r=
56
Area=9847.04
 */