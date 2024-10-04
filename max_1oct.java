import java.util.*;
import java.lang.String;

class poly3
{
    int a,b,c;
    void max()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers=");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.println("max="+a);
        else
            System.out.println("max"+b);
    }
    void max(int c)
    {
        this.c=c;
        if (a>b)
        {
            if(a>c)
            {
                System.out.println("max="+a);
            }
            else
            {
                System.out.println("max="+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("max="+b);
            }
            else
            {
                System.out.println("max="+c);
            }
        }
    }
}
public class max_1oct
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        poly3 p1=new poly3();
        p1.max();
        System.out.println("enter third number=");
        c=sc.nextInt();
        p1.max(c);
    }
}