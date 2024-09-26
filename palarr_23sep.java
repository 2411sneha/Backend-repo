import java.util.*;
public class palarr_23sep
{
    int p,n,n1,sum=0;
    palarr_23sep(int n)
    {
        this.n=n;
    }
    String pal()
    {
        p=n;
        while(p>0)
        {
            n1=p%10;
            p=p/10;
            sum=(sum*10)+n1;
        }
        if(sum==n)
            return "number is pallindrome";
        else
            return "number is not pallindrome";
    }
    public static void main(String[] args)
    {
        int a,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of records=");
        a=sc.nextInt();
        palarr_23sep a1[]=new palarr_23sep[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("enter value of n=");
            n=sc.nextInt();
            a1[i]=new palarr_23sep(n);
            System.out.println(""+a1[i].pal());
        }
    }
}