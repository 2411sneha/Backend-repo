import java.util.*;
public class pronic
{
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array =");
		n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter"+n+"Elements of array ");
		for(i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Array =");
		for(i=0;i<n;i++)
		{
			for(j=1;j<=num[i]-1;j++)
			{
				if(num[i]==(j*(j+1)))
				{
					System.out.println(num[i]+"is a pronic number");
				}
			}
		}
	}
}