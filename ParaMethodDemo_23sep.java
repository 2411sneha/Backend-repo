import java.util.*;
public class ParaMethodDemo_23sep
{
    int flag=0,n1,n,x,sum=0,p,f1=1,i;
    ParaMethodDemo_23sep(int n)
    {
        this.n=n;
    }
    void pattern()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println(""+j);
            }
            System.out.println();
        }
    }
    void prime()
    {
        for(i=2;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("number is prime");
        else
            System.out.println("number is not prime");
    }
    String pal()
    {
        p=n;
        while (p>0)
        {
            n1=p%10;
            p=p/10;
            sum=(sum*10)+n1;
        }
        if(sum==n)
            return "number is pallindrome";
        else
            return "number is not pallindrome";
    }
    int power(int x)
    {
        this.x=x;
        for(i=1;i<=n;i++)
        {
            f1=f1*x;
        }
        return (f1);
    }
    public static void main(String[] args)
    {
        int n,x,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of records=");
        a=sc.nextInt();
        ParaMethodDemo_23sep a1[]=new ParaMethodDemo_23sep[a];
        for(int i=0;i<a;i++)
        {
        System.out.println("Enter value of n=");
        n=sc.nextInt();
        a1[i]=new ParaMethodDemo_23sep(n);


        a1[i].pattern();

        a1[i].prime();
        System.out.println(""+a1[i].pal());
        System.out.println("enter value of x=");
        x=sc.nextInt();
        int f1=a1[i].power(x);
        System.out.println("power="+f1);
        }
    }
}