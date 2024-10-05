import java.util.*;
import java.lang.String;

public class factarrobj_18sep
{
    int n,f1=1,i;
    void accept(int n)
    {
        this.n=n;
    }
    int cal_fact()
    {
        for(i=n;i>1;i--)
        {
            f1=f1*i;
        }
        return(f1);
    }

    public static void main(String[] args)
    {
        int n,a,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number records=");
        a=sc.nextInt();

        factarrobj_18sep a1[]=new factarrobj_18sep[a];
        for(i=0;i<a;i++)
        {
            a1[i]=new factarrobj_18sep();
            System.out.println("enter number=");
            n=sc.nextInt();
            a1[i].accept(n);
            System.out.println("Factorial="+a1[i].cal_fact());
        }
    }
}


/*
enter number records=
3
enter number=
5
Factorial=120
enter number=
6
Factorial=720
enter number=
4
Factorial=24
 */