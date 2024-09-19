import java.util.*;
import java.util.Scanner;

public class maxarrobj_18sep
{
    int a,b;
    void accept(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void cal_max()
    {
        // int a,b;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter 2 numbers=");
        // a=sc.nextInt();
        // b=sc.nextInt();
        if(a>b)
        System.out.println("Max="+a);
        else
        System.out.println("Max="+b);
    }

    public static void main(String[] args)
    {
        int n,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of records=");
        n=sc.nextInt();
        maxarrobj_18sep a1[]=new maxarrobj_18sep[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=new maxarrobj_18sep();
           
           System.out.println("enter 2 numbers=");
           a=sc.nextInt();
           b=sc.nextInt();
           a1[i].accept(a,b);
           a1[i].cal_max();
        }
    }
}


/*
 * enter no of records=
2
enter 2 numbers=
5
6
Max=6
enter 2 numbers=
4
6
Max=6
 */