import java.util.*;
import java.util.Scanner;
import java.lang.String;

//accept website url address from user and check whether it tis valid or not
public class website_17sep 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter website=");
        String str=sc.next();
        if(str.startsWith("http://www.") && str.endsWith(".com"))
        {
            System.out.println("website valid");
        }
        else
        {
            System.out.println("website is not valid");
        }
    }
}


/*
 * enter website=
http://www.google.com
website valid

enter website=
sdfghajgw
website is not valid
 */