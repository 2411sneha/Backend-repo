import java.util.*;
import java.util.Scanner;
public class even_add
{
	public static void main(String[] args)
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size=");
		n=sc.nextInt();
		System.out.println("enter "+n+" elements");
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n array :");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("\n addition of even numbers in array:"+sum);
	}
}