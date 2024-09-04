import java.util.*;
public class sum_avg
{
	public static void main(String[] args)
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array =");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+(sum/n));
	}
}