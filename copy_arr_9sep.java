import java.util.*;
public class copy_arr
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size=");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		System.out.print("array =");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("Copied elements are =");
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]+"\t");
		}
	}
}
