import java.util.*;
import java.util.Scanner;
public class num_zero
{
	public static void main(String[] args)
	{
		int i,n,g;
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
		System.out.println("\n array with zero=");
		for(i=0;i<n;i++)
		{
			int n1=a[i];
			while(n1>0)
			{
				g=n1%10;
				n1=n1/10;
				if(g==0)
				{
					System.out.print("\t"+a[i]);
				}
			}
		}
	}
}