import java.util.*;
import java.util.Scanner;
import java.lang.String;

//accept 1 string from user and check whether 'india' string present or not if present then print msg 'i like my country india' otherwise print msg
public class string14_17sep
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String inputstr="India is my country.";
        System.out.println("enter string=");
        String str=sc.next();
        if(inputstr.contains(str))
        {
            System.out.println(str+" is present in "+inputstr);
        }
        else
        {
            System.out.println(str+" is not present in "+inputstr);
        }
    }
}

/*
 * enter string=
country
country is present in India is my country.

enter string=
sneha
sneha is not present in India is my country.
 */