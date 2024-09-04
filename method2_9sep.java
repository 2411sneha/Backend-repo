import java.util.*;
public class method2
    {
        static void add()
        {
            int n,i,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number=");
			n=sc.nextInt();
			System.out.println("using for loop");
			for(i=1;i<n;i++)
			{
				sum=sum+i;
			}
			System.out.println("sum="+sum);
			System.out.println("using while loop");
			i=1;
			while(i<n)
			{
				sum=sum+i;
				i++;
			}
			System.out.println("sum="+sum);
			
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
		System.out.println("using while loop");
		i=3;
		while(i<=n)
		{
			f3=f1+f2;
			i++;
			f1=f2;
			f2=f3;
			System.out.println(" "+f3);
		}
		System.out.println("using for loop");
			for(i=3;i<=n;i++)
			{
				f3=f1+f2;
				System.out.println(" "+f3);
				f1=f2;
				f2=f3;
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
			add();
			add();
			fibo();
			mult();
			prime();
		}
    }