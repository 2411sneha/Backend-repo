import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.io.*;

//Compare methods
//A.compareTo(String)
//B.compareToIgnoreCase()

public class string9_16sep
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 string=");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		/*if(s1.compareTo(s2)==0)
		{
			System.out.println("both are equals");
		}
		else if(s1.compareTo(s2)>0)
		{
			System.out.println(s1+" greater than "+s2);
		}
		else
		{
			System.out.println(s2+" greater than "+s1);
		}
		*/
		if(s1.equals(s2)==true)
		{
			System.out.println("both are equlas");
		}
		else
		{
			System.out.println("both are not equlas");
		}
	}
}


/*
enter 2 string=
sneha
neha
sneha greater than neha

enter 2 string=
neha
neha
both are equals
*/

/*
enter 2 string=
sneha
sneha
both are equlas

enter 2 string=
sneha
neh
both are not equlas
*/