import java.util.*;
import java.util.Scanner;
public class left_rotate
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size =");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are =");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("	left rotate array :");
		for(i=2;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.print("\t"+a[0]);
		System.out.print("\t"+a[1]);
	}
}