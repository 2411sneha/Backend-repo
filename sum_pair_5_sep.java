import java.util.*;
import java.util.Scanner;
public class sum_pair_5_sep
{
	public static void main(String[] args)
	{
		int n;
		int[] arr={50,30,10,20,40,60};
		Scanner sc=new Scanner(System.in);
		System.out.println("given array=");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println("enter number=");
		n=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]==n)
				{
					System.out.println("sum of pair=("+arr[i]+","+arr[j]+")");
				}
				
			}
		}
	}
}