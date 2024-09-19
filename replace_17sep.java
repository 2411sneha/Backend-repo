import java.util.*;
import java.util.Scanner;

public class replace_17sep 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1="my name is khan my name is java";
        String repalString=s1.replace("is","was");
        System.out.println(repalString); 
        String replaceall=s1.replaceAll("a","e");
        System.out.println(replaceall); 
        String[] words=s1.split("\\s");
        for(String w:words)
        {
            System.out.println(w);
        }
    } 
}

/*
my name was khan my name was java
my neme is khen my neme is jeve
my
name
is
khan
my
name
is
java
 */