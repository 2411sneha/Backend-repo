import java.util.*;
public class linear_search
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		int key=99;
		int flag=1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=0;
				System.out.println("Element found");
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element not found");
		}
	}
}