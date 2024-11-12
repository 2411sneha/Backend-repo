package com.oit;
import java.util.Scanner;
import java.sql.*;

public class DisplayTable3
{

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");
		Statement statement=connection.createStatement();
		System.out.println("Enter department Name letter : ");
		String dname=sc.next();
		ResultSet rs=statement.executeQuery("select * from department_info where dept_name like '"+dname+"%'");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		connection.close();
	}

}



/*
Driver Register
Enter department Name letter : 
c
1	sneha	computer science
4	harshda	computer science
*/
