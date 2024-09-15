import java.util.*;
import java.util.Scanner;
import java.lang.String;

//print all characters from given string
public class string2_14sep
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String=");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.println("char at "+i+" place "+str.charAt(i));
		}
	}
}

/*
output:-
java string2_14sep
Enter String=
sneha
char at 0 place s
char at 1 place n
char at 2 place e
char at 3 place h
char at 4 place a
*/