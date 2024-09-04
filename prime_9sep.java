//prime or not prime number

import java.util.*;
public class prime
{
	public static void main(String[] args)
	{
		int[] num={21,19,37,12,81,83};
		int[] pnum=new int[3];
		int[] npnum=new int[3];
		int pcount=0;
		int npcount=0;
		
		for(int i=0;i<num.length;i++)
		{
			int flag=1;
			for(int j=2;j<=num[i]/2;j++)
			{
				if(num[i]%j==0)
				{
					flag=0;
					npnum[npcount]=num[i];
					npcount++;
					break;
				}
			}
			if(flag==1)
			{
				pnum[pcount]=num[i];
				pcount++;
			}
		}
		System.out.println("Prime array :");
		for(int i=0;i<pnum.length;i++)
		{
			System.out.println(pnum[i]);
		}
		System.out.println("non-Prime array :");
		for(int i=0;i<npnum.length;i++)
		{
			System.out.println(npnum[i]);
		}
	}
}