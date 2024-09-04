//check wheather given number is even or odd 

import java.util.*;
public class even_odd
{
	public static void main(String[] args)
	{
		int[] num={21,91,83,20,24,10};
		int enum[]=new int[3];
		int onum[]=new int[3];
		int ecount=0;
		int ocount=0;
		
		for(int i=0;i<num.length;i++)
		{
			int flag=1;
			if(num[i]%2==0)
			{
				flag=0;
				enum[ecount]=num[i];
				ecount++;
				break;
			}
			if(flag==1)
			{
				onum[ocount]=num[i];
				ocount++;
			}
		}
		System.out.println("Even numbers :");
		for(int num:enum)
		{
			System.out.println(enum[i]);
		}
		System.out.println("Odd numbers :");
		for(int num:onum)
		{
			System.out.println(onum[i]);
		}
	}
}