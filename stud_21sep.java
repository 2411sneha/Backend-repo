import java.util.*;

class student
{
    int id;
    String name;
    double per;
    student()
    {
        id=1148;
        name="sneha";
        per=98.32;
    }
    student(int id,String name, double per)
    {
        this.id=id;
        this.name=name;
        this.per=per;
    }
    void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("percentage="+per);
    }
}
public class stud_21sep
{
    public static void main(String[] args)
    {
        student s1=new student();
        s1.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id=");
        int id=sc.nextInt();
        System.out.println("name=");
        String name=sc.next();
        System.out.println("percentage=");
        double per=sc.nextDouble();

        student s2=new student(id,name,per);
        s2.display();
    }
}