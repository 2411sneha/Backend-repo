import java.util.*;
import java.util.Scanner;

public class empty_17sep 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string=");
        String str=sc.nextLine();
        int size=str.length();
        if(size==0)
        {
            System.out.println("the string is empty.\n");
        }
        else if(size > 0 && str.trim().isEmpty())
        {
            System.out.println("the string is blank.\n");
        }
        else if(str==null)
        {
            System.out.println("the string is null.\n");
        }
        else
        {
            System.out.println("the string is not blank.\n");
        }
    }
}

/*enter string=

the string is empty.

enter string=
df
the string is not blank.
 */
