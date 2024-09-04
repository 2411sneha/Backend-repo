import java.util.*;
public class sub3
{
	static void sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("substraction="+c);
	}
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers=");
		a=sc.nextInt();
		b=sc.nextInt();
		sub(a,b);
	}
}
		