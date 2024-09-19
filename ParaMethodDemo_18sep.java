import java.util.*;
public class ParaMethodDemo_18sep
{
    int flag=0,n1,n,x,sum=0,p,f1=1,i;
    void accept(int n)
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
        while(p>0)
        {
            n1=p%10;
            p=p/10;
            sum=(sum*10)+n1;
        }
        if(sum==n)
            return "number is pallendrom";
        else
            return "number is not pallendrom";
    }
    int power(int x)
    {
        this.x=x;
        for(i=1;i<=n;i++)
        {
            f1=f1*x;
        }
        return (f1);//power==x raise to n i.e. 3 raise to 5=243
    }
    
    public static void main(String[] args)
    {
        int n,x;
        Scanner sc =new Scanner (System.in);
        ParaMethodDemo a1=new ParaMethodDemo();
        System.out.println("enter valur of n=");
        n=sc.nextInt();
        a1.accept(n);
        a1.pattern();

        a1.prime();
        System.out.println(""+a1.pal());
        System.out.println("enter value of x=");
        x=sc.nextInt();
        int f1=a1.power(x);
        System.out.println("Power "+f1);
    }
}

/*
enter valur of n=
5

1

1
2

1
2
3

1
2
3
4

1
2
3
4
5

number is prime
number is pallendrom
enter value of x=
3
Power 243
 */