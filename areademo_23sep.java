import java.util.*;

public class areademo_23sep
{
    double r,A;
    areademo_23sep()
    {
        r=0.0;
    }
    areademo_23sep( double r)
    {
        this.r=r;
    }
    double cal_area()
    {
        A=3.14*r*r;
        return(A);
    }
    public static void main(String[] args)
    {
        double r,A;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of records=");
        n=sc.nextInt();
         
        areademo_23sep a1[]=new areademo_23sep[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter value of r=");
            r=sc.nextDouble();
            a1[i]=new areademo_23sep(r);
            A=a1[i].cal_area();
            System.out.println("Area="+A);
        }
    }
}