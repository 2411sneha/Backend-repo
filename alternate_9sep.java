import java.util.*;
public class alternate
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array=");
		n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Array :");
		for(i=0;i<n;i++)
		{
			for(i=0;i<n;i=i+2)
			{
				System.out.print(num[i]+"\t");
			}	
		}
	}
}