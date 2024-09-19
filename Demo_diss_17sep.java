import java.util.Scanner;
import java.util.*;

 public class Demo_diss_17sep
 {
    int n;
    void accept()
    {
        this.n=n;
    }
     static void diss()
    {
        int n,n1,f1=1,sum=0,num=0,p,digits=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number=");
        n=sc.nextInt();
        num=n;
        p=n;
        while(num>0)
        {
            digits++;
            num=num/10;
        }
        while(n>0)
        {
            n1=n%10;
            n=n/10;
            f1=1;
            for(i=1;i<=digits;i++)
            {
                f1=f1*n1;
            }
            digits--;
            sum=sum+f1;
        }
        if(p==sum)
        {
            System.out.println("dissarium number");
        }
        else
        {
            System.out.println("not dissarium number");
        }
    }
    static int vowel()
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string=");
        str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        return count;
    }
    static void max(int a,int b)
    {
        if (a>b) 
        {
            System.out.println(a+" is greater");
        }
        else
        {
            System.out.println(b+" is greater");
        }
    }
    public static void main(String[] args)
    {
        Demo_diss a1=new Demo_diss();
        a1.accept();
        a1.diss();
    }
    {
        int s1=vowel();
        System.out.println(s1);
    }
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter 2 number=");
        a=sc.nextInt();
        b=sc.nextInt();
        max(a, b);
    }
 }