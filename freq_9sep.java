import java.util.Scanner;
import java.util.*;
public class freq
{
	public static void main(String[] args)
	{
		int i,j,n=7,count=0;
		Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter array size=");
	//	n=sc.nextInt();
		int a[]={2,3,2,4,5,4,5};
		int [] frequency = new int [n];
		//System.out.println("Enter "+n+" elements:");
		/*for(i=0;i<n;i++)
		{
		//	a[i]=sc.nextInt();
		}*/
		System.out.println("Array :");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
		System.out.println("Frequency of each element =");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					frequency[i]=count;
				}
			}
			/*if(frequency[i]!=counted)
			{
				frequency[i]=count;
			}*/
		}
		for(i=0;i<frequency.length;i++)
		{
			System.out.println("Element: "+a[i] + " Frequency: " + frequency[i]);
			/*if(frequency[i] != counted)
			{
				System.out.println("Element: "+a[i] + " Frequency: " + frequency[i]);
			}*/
		}
	}
}