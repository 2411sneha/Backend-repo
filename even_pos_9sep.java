import java.util.*;
import java.util.Scanner;
public class even_pos
{
	public static void main(String[] args)
	{
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size =");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter "+n+" elements=");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("array elements are :");
	for(i=0;i<n;i++)
	{
		System.out.print("   "+a[i]);
	}
	System.out.println("even position array :");
	for(i=0;i<n;i=i+2)
	{
		System.out.print("\t"+a[i]);
	}
}
}