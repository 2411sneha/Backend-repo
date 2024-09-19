import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.io.*;

//String Concat
public class string11_16sep
{
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 string=");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.concat(s2);
		System.out.println("concatenated string="+s1);
		s1=s1.concat(" is immutable so assign it explicitly");
		System.out.println(s1);
	}
}

/*
enter 2 string=
sneha
bhosale
concatenated string=snehabhosale
snehabhosale is immutable so assign it explicitly
*/