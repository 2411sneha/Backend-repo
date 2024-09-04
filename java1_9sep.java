import java.util.*;
public class java1
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number =");
		n=sc.nextInt();
		for(i=2;i<=n;i=i+2)
		{
			System.out.println(" "+i);
		}
	}
}