import java.util.*;
public class arraydemo
{
	public static void main(String[] args)
	{
		int i,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array =");
		n=sc.nextInt();
		int a[]=new int[n];
		if(n%2==0)
		{
			System.out.println("Enter "+n+" elements=");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Array:");
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]+"\t");
			}
			System.out.println("\nfinal array=");
			for(i=0;i<n;i=i+2)
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]+"\t");
			}
		}
		else
		{
			System.out.println("\n array size is invalid");
		}
	}
}