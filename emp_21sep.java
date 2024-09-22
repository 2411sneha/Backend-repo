import java.util.*;

class employee
{
    int eid;
    String name;
    double salary;

    employee()
    {
        eid=101;
        name="sneha";
        salary=50500;
    }
    void display()
    {
        System.out.println("employee id="+eid);
        System.out.println("Name="+name);
        System.out.println("salary="+salary);
    }
}
public class emp_21sep
{
    public static void main(String[] args)
    {
        employee e1=new employee();
        e1.display();
        employee e2=new employee();
        e2.display();
    }
}