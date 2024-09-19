import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.io.*;

//Accept user name and paasword from user and check whether valid or not also check validations
public class string10_16sep
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username=");
		String s1=sc.nextLine();
		System.out.println("Enter password=");
		String s2=sc.nextLine();
		if(s1.equals("")==true)
		{
			System.out.println("enter username=");
		}
		else if(s2.equals("")==true)
		{
			System.out.println("enter password=");
		}
		else if(s1.equals("admin")==true && s2.equals("1234")==true)
		{
			System.out.println("Lgin success");
		}
		else
		{
			System.out.println("login unsuccess");
		}
	}
}

/*
Enter username=
admin
Enter password=
1234
Lgin success

Enter username=
sneha
Enter password=
2411
login unsuccess
*/