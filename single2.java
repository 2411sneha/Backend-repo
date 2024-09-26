
import java.util.*;
class student
{
	int id;
	String name;
	student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display() 
	{
		System.out.println("Stud id:"+id+"\n Stud name:"+name);
	}
}
class ex_student extends student
{
	String cname;
	double salary;
	ex_student(int id,String name,String cname,double salary)
	{
		super(id,name);
		this.cname=cname;
		this.salary=salary;
	}
	void show()
	{
		System.out.println("Com name:"+cname+"\n Salary:"+salary);
	}
}
public class single2 
{

	public static void main(String[] args) 
    {
        int id;
        double salary;
        String name,cname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,cname,salary");
	    id=sc.nextInt();
		name=sc.next();
		cname=sc.next();
		salary=sc.nextDouble();
		ex_student s1=new ex_student(id,name,cname,salary);
		s1.display();
		s1.show();
		

	}
}
