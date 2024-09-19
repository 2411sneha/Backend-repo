import java.util.*;
import java.util.Scanner;

public class format2_17sep 
{
    public static void main(String[] args)
    {
        String str1=String.format("|%10d|",101);//specifying length of integer 101
        String str2=String.format("|%10d|",10001);//specifying length of integer 10001
        String str3=String.format("|%-10d|",101);//left justifying within the specified width 101
        String str4=String.format("|% d|",101);//|101|
        String str5=String.format("|%10d|",101);//filling with zeros |0000000101|
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

    }    
}


/*
|       101|
|     10001|
|101       |
| 101|
|       101|
 */