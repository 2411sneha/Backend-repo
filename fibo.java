import java.util.*;
public class fibo
{
    public static void main(String[] args)
    {
        int f1=0,f2=1,f3,n,i;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number= ");
        n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid number");
        }
        else if(n==1)
        {
            System.out.println(" "+f2);
        }
        else
        {
            System.out.println(f1+" "+f2);
            i=3;
            while(i<=n)
            {
                f3=f1+f2;
                i++;
                f1=f2;
                f2=f3;
                System.out.println(" "+f3);
            }
        }
    }
}