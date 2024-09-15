import java.util.*;
import java.util.Scanner;
import java.lang.String;

//Convert lowercase character into uppercase & viceversa
//A=65   a=97 32+    a=97 A=65 32-
public class string5_14sep
{
	public static void main (String[] args)
	{
		String str ; char ch;       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.nextLine();
		for (int i=0; i<=str.length()-1; i++) 
		{
			ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
				System.out.print(""+ch);
			}
			else if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
				System.out.print(""+ch);
			}
		}
	}
}

/*output:-
C:\javaproject>java string5_14sep
Enter string
SneHA
sNEha 
*/