import java.util.*;
import java.util.Scanner;
import java.lang.String;

//print all even position character from given string
public class string3_14sep
{
	public static void main (String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string=");
		str=sc.next();
		for(int i=0;i<str.length();i=i+2)
		{
			System.out.println("char at "+i+" place "+str.charAt(i));
		}
	}
}

/*output:-
enter string=
sneha
char at 0 place s
char at 2 place e
char at 4 place a
*/

//print all odd position character from given string

/*
public class string3_14sep
{
	public static void main (String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string=");
		str=sc.next();
		for(int i=1;i<str.length();i=i+2)
		{
			System.out.println("char at "+i+" place "+str.charAt(i));
		}
	}
}
*/