import java.util.*;
import java.util.Scanner;
public class perfect_sq
{
	public static void main (String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size= ");
		n=sc.nextInt();
		System.out.println("enter "+n+" elements=");
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array =");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		for(i=0;i<n;i++)
		{
			int number=a[i];
			int sqrt = (int) Math.sqrt(number);
			if(sqrt*sqrt == number) 
			{
				System.out.println("\n"+number+" is a perfect square number.");
			}
		}
	}
}