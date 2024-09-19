import java.util.*;
import java.util.Scanner;

public class getchar_17sep 
{
    public static void main(string[] args)
    {
        String str=new  String("hello javat point how r u");
        char [] ch=new char[10];
        try
        {
            str.getChars(6,16,ch,0);
            System.out.println(ch);
        }
        catch(Exception ex)
        {
            System.out.println();       }
    }
}
