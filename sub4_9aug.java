import java.util.*;
public class sub4
{
	static int sub(int a,int b)
	{
		int c;
		c=a-b;
		return (c);
	}
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers=");
		a=sc.nextInt();
		b=sc.nextInt();
		int c=sub(a,b);
		System.out.println("substraction="+c);
	}
}