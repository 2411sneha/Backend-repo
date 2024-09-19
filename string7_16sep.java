import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.io.*;

//java progrm to count no. of small alphabets,capital,digits and special characters
public class string7_16sep
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string=");
		str=sc.nextLine();
		int small=0,capital=0,digit=0,special=0;
		for(int i=0;i<str.length();i++)
		{
			
		
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				small++;
			}
			else if(ch>='A' && ch<='Z')
			{
				capital++;
			}
			else if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
			{
				digit++;
			}
			else 
			{
				
				special++;
			}
		}
		System.out.println("Lowercase character ="+small);
		System.out.println("Uppercase character ="+capital);
		System.out.println("Digits="+digit);
		System.out.println("Special character ="+special);
	}
}

/*
enter string=
asdAA@#$123354
Lowercase character =3
Uppercase character =2
Digits=6
Special character =3
*/