import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.io.*;

//accept 2 string from user if s1>s2 then s2 is concatenate at the end of s1 and if s2>s1 then s1 is concatenate at the end of s2 other wise print msg(with ignoring case)compareToIgnoreCase(),concate()
public class string12_16sep
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 string=");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.compareTo(s2)>0)
		{
			s1=s1.concat(s2);
			System.out.println("Concatenated String="+s1);
		}
		else if(s2.compareTo(s1)>0)
		{
			s2=s2.concat(s1);
			System.out.println("Concatenated String="+s2);
		}
		
	}
}

/*
enter 2 string=
sneha
neha
Concatenated String=snehaneha
*/