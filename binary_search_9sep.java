import java.util.*;
public class binary_search
{
	public static void main(String[] args)
	{
		int[] arr={2,15,18,23,29,35,42,64,81,93};
		int key=99;
		int start=0;
		int end=arr.length-1;
		int flag=1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)
			{
				flag=0;
				System.out.println("Element is present at index "+mid);
				break;
			}
			if(arr[mid]<key)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		if(flag==1)
		{
			System.out.println("Element is not present in the array.");
		}
	}
}