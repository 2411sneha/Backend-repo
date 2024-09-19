import java.util.Scanner;

public class Demo_17sep
{
    int n,f1=1,i,flag=0;
    void accept(int n)
    {
        this.n=n;
    }
    int cal_fact()
    {
        for(i=n;i>=1;i--)
        {
            f1=f1*i;
        }
        return(f1);
    }
    String cal_prime()
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
            return "Prime";
        else
            return "not prime";
    }

    public static void main(String[] args)
    {
        int n,f1;
        Scanner sc=new Scanner(System.in);
        Demo a1=new Demo();
        System.out.println("enter number n=");
        n=sc.nextInt();
        a1.accept(n);
        f1=a1.cal_fact();
        System.out.println("factorial="+f1);
        System.out.println(" "+a1.cal_prime());
    }
}


/*
enter number n=
6
factorial=720
 not prime
 */