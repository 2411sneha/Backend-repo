import java.util.*;
public class strong
{
	public static void main(String[] args)
	{
		int n,n1,n2,i,f1=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array =");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Strong numbers from given array =");
		n1=arr[i];
		for(i=0;i<n;i++)
		while(n1>0)
		{
			
			n1=n1/10;
			f1=1;
			for(i=1;i>1;i++)
			{
				f1=f1*i;
			}
			sum=sum+f1;
		}
		if(n1==sum)
		{
			System.out.println(arr[i]);
		}
	}
}