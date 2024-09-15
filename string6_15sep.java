import java.util.*;
import java.util.Scanner;
import java.lang.String;
 
 //accept email from user check whether it is valid or not
public class string6_15sep
{
	public static void main(String[] args)
	{
		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email address =");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='@' && ch=='.')
			{
				System.out.println("your email is accpected !!!");
			}
			else
			{
				System.out.println("Invalid email address");
			}
		}
	}
}