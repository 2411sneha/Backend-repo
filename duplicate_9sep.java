import java.util.*;
import java.util.Scanner;
public class duplicate
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size =");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are =");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.print("\n	Duplicate numbers:");
		for(i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" "+a[i]);
				}
			}
		}
	}
}