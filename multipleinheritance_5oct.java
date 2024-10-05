import java.lang.String;
import java.util.*;

interface salary
{
    final double TAX=0.05;
    abstract void cal_sal();
}
class employee
{
    int id;
    String name;
    double bs;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id=");
        id=sc.nextInt();
        System.out.println("Enter name=");
        name=sc.next();
        System.out.println("Enter salary=");
        bs=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("Basic salary="+bs);
    }
}
class emp_sal extends employee implements salary
{
    double hra,ta,da,gs,ns;
    public void cal_sal()
    {
        hra=(10/100)*bs;
        ta=(40/100)*bs;
        da=(50/100)*bs;
        gs=bs+hra+da;
        ns=gs-(gs*TAX);

        System.out.println("hra="+hra);
        System.out.println("ta="+ta);
        System.out.println("da="+da);
        System.out.println("gs="+gs);
        System.out.println("Net Salary after tax= "+ns);
    }
}
public class multipleinheritance_5oct
{
    public static void main(String[] args) 
    {
        emp_sal e1=new emp_sal();
        e1.accept();
        e1.display();
        e1.cal_sal();
    }
}