import java.util.*;
public class Stu_18sep
{
    int rno;
    String sname;
    double per;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rollno,name and per");
        rno=sc.nextInt();
        sname=sc.next();
        per=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Roll number="+rno);
        System.out.println("Name="+sname);
        System.out.println("Percentage="+per);
    }


    public static void main(String[] args)
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of students=");
        n=sc.nextInt();
        Stu_18sep s1[]=new Stu_18sep [n];
        for(i=0;i<n;i++)
        {
            s1[i]=new Stu_18sep();
            s1[i].accept();
            s1[i].display();
        }
    }
}

/*
 * enter no of students=
2
enter rollno,name and per
156
sneha
85.20
Roll number=156
Name=sneha
Percentage=85.2
enter rollno,name and per
147
yogia
85.23
Roll number=147
Name=yogia
Percentage=85.23
 */