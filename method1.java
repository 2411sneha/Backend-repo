import java.util.*;
public class method1
    {
        static void sub()
        {
            int a,b,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 numbers=");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a-b;
			System.out.println("Substraction="+c);
        }
		static void fibo()
		{
			int f1=0,f2=1,f3,n,i;
			Scanner sc=new Scanner(System.in);
            System.out.println("Enter number=");
			n=sc.nextInt();
			if(n<=0)
			System.out.println("invalid number");
		else if(n==1)
			System.out.println(" "+f2);
		else
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
		static void mult()
		{
            int a,b,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 numbers=");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a*b;
			System.out.println("Multiplication="+c);
        }
		static void prime()
		{
			int i,n,div=0;
			Scanner sc=new Scanner(System.in);
            System.out.println("Enter number=");
			n=sc.nextInt();
			i=2;
			while(i<(n/2))
			{
				if(n%i==0)
					div=1;
				i++;
				break;
			}
			if(div==0)
				System.out.println("prime number");
			else
				System.out.println("not prime");
		}
		public static void main(String[] args)
		{
			sub();
			fibo();
			mult();
			prime();
		}
    }