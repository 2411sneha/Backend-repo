import java.util.*;
import java.util.Scanner;
// String format
public class format_17sep
{
    public static void main(String[] args)
    {
        String name="india";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
}


/*
 * name is india
value is 32.334340
value is                  32.334340000000
 */