import java.util.*;
import java.util.Scanner;
import java.lang.String;

//count total number of vowels from given string
public class string4_14sep
{
	public static void main (String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string=");
		str=sc.nextLine();
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' )
			{
				count++;
			}
		}
		System.out.println("Total number of vowels are:"+count);
	}
}

/*
output:-
C:\javaproject>java string4_14sep
enter string=
Sneha
Total number of vowels are:2
*/

/*
count total number of digits from given string
char ch=str.charAt(i);
			if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9' )
			{
				count++;
			}
*/