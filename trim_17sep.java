import java.util.*;
import java.util.Scanner;

public class trim_17sep 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1="       hello String      ";
        System.out.println(s1+"javatpoint");
        System.out.println(s1.trim()+" javatpoint");
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);
        String s1lower=s1upper.toLowerCase();
        System.out.println(s1lower);
        String joinstring1=String.join("-","welcom","to","javatpoint");
        System.out.println(joinstring1);
    }
}

/*
        hello String      javatpoint
hello String javatpoint
       HELLO STRING
       hello string
welcom-to-javatpoint
 */