import java.util.*;
public class perfect_no_arr
{
	public static void main(String[] args)
	{
		int n,n1,i,sum=0,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size array=");
		n=sc.nextInt();
		int num[]=new int[n];		//array creation
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("\n Array elements are :");
		for(i=0;i<n;i++)
		{
			System.out.println(num[i]+"\t");
		}
		System.out.println("Perfect numbers from given array =");
		for(i=0;i<n;i++)
		{
			n1=num[i];
			sum=0;
			for(j=1;j<=(n1/2);j++)
				{
					if(n1%j==0)
					{
						sum=sum+j;
					}
				}
				if(n1==sum)
				{
					System.out.println(num[i]+"\t");
				}
		}
	}
}
					