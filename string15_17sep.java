import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class string15_17sep
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 string=");
        String str=sc.next();
        System.out.println("enter 2 string which you wantto check=");
        String str1=sc.next();
        if(str.startsWith(str1))
        {
            System.out.println("String starts with "+str1);
        }
        else
        {
            System.out.println("String not starts with "+str1);
        }
        // if(str.endsWith("."))
        // {
        //     System.out.println("string end with fullstop");
        // }
        // else
        // {
        //     System.out.println("string not end with fullstop");
        // }
        }
}

/*
 enter 1 string=
sneha
enter 2 string which you wantto check=
sn
String starts with sn
 */