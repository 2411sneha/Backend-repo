import java.util.Scanner;
import java.util.*;  
public class descending_bubble 
{
	public static void main(String[] args) 
	{
		int n,i,n1,div=0,j;		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();		
		int a[]=new int[n];//array creation		
		System.out.println("Enter "+ n +" Elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		}		
		System.out.println("\n\nArray elements are");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}		
		//Arrays.sort(a);
		int temp; 
		for ( i = 0; i < n-1; i++)   //passes selection sort
		        {  
		            for ( j = i+1; j < n; j++)  //inner iteration 
		            {  
		                if (a[i] < a[j])   //swap
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }
				}					
		
		System.out.println("\n\nSorted Array elements are");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}                         
	
	}
}