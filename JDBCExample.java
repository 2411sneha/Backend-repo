package com.oit;
import java.sql.*;		//1
import java.util.*;
public class JDBCExample
{
	public static void main(String[] args)throws SQLException,ClassNotFoundException	//2
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");	//3
		System.out.println("Employee Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");		//4
		System.out.println("Connection Success");
		Statement statement=connection.createStatement();	//5
		System.out.println("Enter id ,name ,salary ,designation and email :");
		int id=sc.nextInt();
		String ename=sc.next();
		float salary=sc.nextFloat();
		String designation=sc.next();
		String email=sc.next();
		
		String s1="insert into employee(id,ename,salary,designation,email)values("+id+" ,'"+ename+"' ,"+salary+" ,'"+designation+" ','"+email+"')";
		int id1=statement.executeUpdate(s1);	//6
		if(id1 > 0)
		{
			System.out.println("Save success");
		}
		else
		{
			System.out.println("Save unsuccessful");
		}
		
		statement.close();
		connection.close();
	}
}