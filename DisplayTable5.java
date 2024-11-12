package com.oit;
import java.util.Scanner;
import java.sql.*;

public class DisplayTable5 
{

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");
		System.out.println("Connection success");
		Statement statement=connection.createStatement();		
		String s1="alter table student drop column per";
		int id1=statement.executeUpdate(s1);
		if(id1 == 0)
			System.out.println("column percentage has been removed successfully.");
		else
			System.out.println("can't delete percentage column");
		
		connection.close();
		statement.close();
	}

}
