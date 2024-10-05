import java.util.*;
import java.lang.String;

interface intoperations
{
    abstract void even_odd();
    abstract void pos_neg();
    abstract void prime();
    abstract void fact();
    abstract void sumd();
}
class mynumber implements intoperations
{
    private int n;
    mynumber(int n)
    {
        this.n=n;
    }
    mynumber()
    {
        n=0;
    }
    public void even_odd()
    {
        if(n%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
    public void pos_neg()
    {
        if(n > 0)
        {
            System.out.println("positive number");
        }
        else
        {
            System.out.println("negative number");
        }
    }
    public void prime()
    {
        boolean var=true;
        for(int i=2;i<(n/2);i++)
        {
            if(n%i==0)
            {
                var=false;
                System.out.println("prime number");
            }
            else
            {
                System.out.println("not prime number");
            }
        }
    }
    public void fact()
    {
        int f1=1,i;
        for(i=n;i>1;i--)
        {
            f1=f1*i;
        }
        System.out.println(f1);
    }
    public void sumd()
    {
        int n1=0,sum=0;
        while(n>0)
        {
            n1=n%10;
            n=n/10;
            sum=sum+n1;
        }
        System.out.println("addition="+sum);
    }
}
public class testinterface2_4oct
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n=");
        n=sc.nextInt();
        mynumber b=new mynumber(n);
        b.even_odd();
        b.pos_neg();
        b.prime();
        b.fact();
        b.sumd();
    }
}


/*
 * enter value of n=
5
odd number
positive number
120
addition=5
 */