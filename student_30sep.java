// import java.lang.String;
// import java.util.*;

// class student
// {
//     int id;
//     String name;

//     student(int id,String name)
//     {
//         this.id=id;
//         this.name=name;
//     }
//     void display()
//     {
//         System.out.println("Student id="+id);
//         System.out.println("Student name="+name);
//     }
// }
// class marks extends student
// {
//     int m1,m2,m3;
//     marks(int id,String name,int m1,int m2,int m3)
//     {
//         super(id,name);
//         this.m1=m1;
//         this.m2=m2;
//         this.m3=m3;
//     }
//     void show()
//     {
//         System.out.println("Subject 1 marks="+m1);
//         System.out.println("Subject 2 marks="+m2);
//         System.out.println("Subject 3 marks="+m3);
//     }
// }
// class result extends marks
// {
//     int total;
//     double per;
//     result(int id,String name, int m1,int m2,int m3)
//     {
//         super(id,name,m1,m2,m3);
        
//     }
//     void cal_result()
//     {
//         int total=m1+m2+m3;
//         double per=total/3;
//         System.out.println(":Total Marks="+total);
//         System.out.println("Percentage="+per);
//     }
//     void cal_class()
//     {
//         if(per>=80 && per<=100)
// 			System.out.println("Distinction");
// 		else if(per>=70 && per<=79)
// 			System.out.println("First class");
// 		else if(per>=50 && per<=69)
// 			System.out.println("Second class");
// 		else if(per>=40 && per<=49)
// 			System.out.println("Pass class");
// 		else
// 			System.out.println("Fail");
//     }
// }

// public class student_30sep
// {
//     public static void main(String[] args) 
//     {
//         int id,m1,m2,m3,total;
//         double per;
//         String name;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Student id,name=");
//         id=sc.nextInt();
//         name=sc.next();
//         System.out.println("Enter your subject marks=");
//         m1=sc.nextInt();
//         m2=sc.nextInt();
//         m3=sc.nextInt();
//         System.out.println("Your total number of marks and percentage=");
//         result r1=new result(id, name, m1, m2, m3);
//         r1.display();
//         r1.show();
//         r1.cal_result();
//         r1.cal_class();
    
//     }
// }

import java.lang.String;
import java.util.*;
class stud{
	int id;
	String name;
	stud(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void show_stud()
	{
		System.out.println("Student id:"+id+"\nStudent name:"+name);
	}
}
class marks extends stud{
	float m1,m2,m3;
	marks(int id,String name,float m1,float m2,float m3)
	{
		super(id,name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void show_marks()
	{
		System.out.println("Marks1:"+m1+"\nMarks2:"+m2+"\nMarks3:"+m3);
	}
}
class result extends marks{
	float total,per;
	result(int id,String name,float m1,float m2,float m3)
	{
		super(id,name,m1,m2,m3);
	}
	void cal_result()
	{
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Total marks:"+total+"\nPercentage:"+per);
	}
	void cal_class()
	{
		if(per>=80 && per<=100)
			System.out.println("Distinction");
		else if(per>=70 && per<=79)
			System.out.println("First class");
		else if(per>=50 && per<=69)
			System.out.println("Second class");
		else if(per>=40 && per<=49)
			System.out.println("Pass class");
		else
			System.out.println("Fail");
	}
}
public class student_30sep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,m1,m2,m3");
		int id=sc.nextInt();
		String name=sc.next();
		float m1=sc.nextFloat();
		float m2=sc.nextFloat();
		float m3=sc.nextFloat();
		result r1=new result(id,name,m1,m2,m3);
		r1.show_stud();
		r1.show_marks();
		r1.cal_result();
		r1.cal_class();
	}

}