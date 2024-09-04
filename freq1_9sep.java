import java.util.*;
import java.util.Scanner;
public class freq1 
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
    int [] frequency = new int [n];
    int counted = -1;
    for( i = 0; i < n; i++)
	{
      int count = 1;
      for(int j = i+1; j < n; j++)
	  {
        if(numbers[i] == numbers[j])
		{
          count++;
          frequency[j] = counted;
        }
      }
      if(frequency[i] != counted)
        frequency[i] = count;
    }
    for( i = 0; i < n; i++)
	{
      if(frequency[i] != counted)
        System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
    }
  }
}