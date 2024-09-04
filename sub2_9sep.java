import java.util.*;
public class sub2
{
	static int sub()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers=");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		return (c);
	}
	public static void main (String[] args)
	{
		int c=sub();
		System.out.println("substraction="+c);
	}
}