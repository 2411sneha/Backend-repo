import java.util.*;
import java.util.Scanner;
public class remove_duplicate 
{
  public static void main(String[] args) 
  {
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size=");
	n=sc.nextInt();
    int[] numbers = new int [n];
	System.out.println("enter "+n+" elements");
	for(i=0;i<n;i++)
	{
		numbers[i]=sc.nextInt();
	}
    int [] freq = new int [n];
    int counted = -1;
	int uni[]=new int[n];
	System.out.println("array:");
    for( i = 0; i < n; i++)
	{
      if(freq[i] != counted)
	  {
		  uni[i] = numbers[i];
		  System.out.println("Element "+numbers[i]+" Frequency "+freq[i]);
	  }
	}
	System.out.println("unique elements array :");
	for( i=0;i<n;i++)
	{
		if(uni[i] != 0)
		{
			System.out.println(uni[i]+" ");
		}
	}
  }
}