import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class String1_14sep
{
	public static void main(String[] args)
	{
		String s1="java";
		char ch[]={'s','t','r','i','n','g'};
		String s2=new String(ch);
		String s3=new String("example");
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.print(s1);
		System.out.print(" "+s2);
		System.out.print(" "+s3);
		System.out.print(" "+name);
	}
}