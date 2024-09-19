import java.util.*;
import java.util.Scanner;

//Contains String or not
public class contains_16sep
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("enter 1 string=");
		String str1=sc.next();
		System.out.println("enter 2 string which you want to check=");
		String str2=sc.next();
		if(str1.contains(str2))
		{
			System.out.println(str1+" is contains in "+str2);
		}
		else
		{
			System.out.println(str1+" is not contains in "+str2);
		}*/
		System.out.println("Enter 1 string");
	     String str=sc.next();  
	     System.out.println("Enter 2 string which u want to check");
	     String str1=sc.next();  
	             if(str.contains(str1)) 
	             {  
	                 System.out.println(str1+" is contains in "+str);  
	             }
	            else  
	                System.out.println(str1+" is not contains in "+str);
	}
}