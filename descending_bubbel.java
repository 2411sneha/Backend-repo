import java.util.*;
public class descending_bubble
{
	public static void main(String[] args)
	{
		int[] arr={45,23,78,56,90,71,15,35};
		
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array :");
		for(int elem:arr)
		{
			System.out.print(elem+" ");
		}
	}
}
			