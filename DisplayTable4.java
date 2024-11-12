package com.oit;
import java.util.Scanner;
import java.sql.*;

public class DisplayTable4 
{

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");
		System.out.println("Connection success");
		Statement statement=connection.createStatement();
		System.out.println("Enter department name letter : ");
		String dname=sc.next();
		String s1="delete from department_info where dept_name like '"+dname+"%'";
		int id1=statement.executeUpdate(s1);
		if(id1 > 0)
			System.out.println("Deleted Success");
		else
			System.out.println("Delete unsuccess");
		
		connection.close();
	}
}
