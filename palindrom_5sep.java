import java.util.*;
import java.util.Scanner;
public class palindrom_5sep
{
	static void pal1()			//no parameter no return value
	{
		int n,n1,sum=0,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number=");
		n=sc.nextInt();
		p=n;
		while(p>0)
		{
			n1=p%10;
			p=p/10;
			sum=(sum*10)+n1;
		}
		if(sum==n)
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");
	}
	static String pal2()				//no parameter with return
	{
		int n,i,sum=0,n1,p;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter value of n");
		n=sc.nextInt();	
		p=n;
		while(p>0)
		{
		n1=p%10;
		p=p/10;
		sum=(sum*10)+n1;
		}
		if(sum==n)
			return "Number is palindrom";
		else
			return "Number is not palindrom";
	}
	static void pal3(int n)				//with parameter no return
	{
		int i,sum=0,n1,p;
		Scanner sc=new Scanner(System.in);
		p=n;
		while(p>0)
		{
			n1=p%10;
			p=p/10;
			sum=(sum*10)+n1;
		}
		if(sum==n)
			System.out.println("number is palindrom.");
		else
			System.out.println("number is not palindrom");
	}
	static String pal4(int n)					//with parameter with return
	{
		int n1,i,sum=0,p;
		p=n;
		while(p>0)
		{
			n1=p%10;
			p=p/10;
			sum=(sum*10)+n1;
		}
		if(sum==n)
			return "number is palindrom";
		else
			return "number is not palindrom";
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//no parameter no return value
		pal1();
		//no parameter with return
		String s1=pal2();
		System.out.println(" "+s1);
		//with parameter no return
		int n;
		System.out.println("Enter number=");
		n=sc.nextInt();
		pal3(n);
		//with parameter with return
		//int n;
		String a=pal4(n);
		System.out.println(" "+a);
	}
}