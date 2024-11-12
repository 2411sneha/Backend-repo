package com.oit;
import java.sql.*;
import java.util.*;
public class JDBCBook 
{
	public static void main(String[] args)throws SQLException,ClassNotFoundException 
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Book Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");
		System.out.println("Connection success");
		Statement statement=connection.createStatement();		
		System.out.println("Enter book id, book name, author name, publication name and price");
		int bid=sc.nextInt();
		String bname=sc.next();
		String author=sc.next();
		String publication=sc.next();
		float price=sc.nextFloat();
		
		String s1="insert into book(bid,bname,author,publication,price)values("+bid+" ,'"+bname+"' ,'"+author+"' ,'"+publication+"' ,"+price+")";
		int id1=statement.executeUpdate(s1);
		if(id1 > 0)
			System.out.println("Save successful");
		else
			System.out.println("Save Unsuccessful");
		
		statement.close();
		connection.close();
	}

}
