import java.util.*;
public class sub1
{
	static void sub() //no parameter no return
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers=");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("substraction="+c);
	}
	public static void main(String[] args)
	{
		sub();
	}
}