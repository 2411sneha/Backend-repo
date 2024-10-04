import java.lang.String;
import java.util.*;


class addition
{
    int a,b,c,add;
    void add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number =");
        a=sc.nextInt();
        b=sc.nextInt();
        add=a+b;
        System.out.println("Addition of two numbers="+add);
    }
    void add(int c)
    {
        this.c=c;
        add=a+b+c;
        System.out.println("addition of 3 numbers="+add);
    }
}

public class add_1oct
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        addition m1=new addition();
        m1.add();
        System.out.println("enter third number=");
        c=sc.nextInt();
        m1.add(c);
    }
}

/*
 * enter two number =
5
6
Addition of two numbers=11
enter third number=
6
addition of 3 numbers=17
 */