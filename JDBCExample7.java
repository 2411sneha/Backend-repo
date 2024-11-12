package com.oit;
import java.sql.*;
import java.util.*;

public class JDBCExample7 
{
	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		int bid,id1,ch;
		String author,publication,bname,s1;
		float price;
		ResultSet rs;
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");
		System.out.println("Connection Success");
		Statement statement=connection.createStatement();
		do
		{
			System.out.println("1:Save\n2:Delete\n3:Update\n4:Read All Data\n5:Search Data");
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Book id,name,author name,publication and price : ");
				bid=sc.nextInt();
				bname=sc.next();
				author=sc.next();
				publication=sc.next();
				price=sc.nextFloat();
				s1="insert into book values("+bid+" ,'"+bname+"' ,'"+author+"' ,'"+publication+"' ,"+price+")";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("save success");
				else
					System.out.println("save unsuccess");
				break;
				
			case 2:
				System.out.println("Enter book id : ");
				bid=sc.nextInt();
				s1="delete from book where bid="+bid+"";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("delete success");
				else
					System.out.println("delete unsuccess");
				break;
				
			case 3:
				System.out.println("Enter Book id,name and book author : ");
				bid=sc.nextInt();
				bname=sc.next();
				author=sc.next();
				s1="update book set bname='"+bname+"',author='"+author+"' where bid="+bid+"";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("update successfully");
				else
					System.out.println("update unsuccessfully");
				break;
				
			case 4:
				s1="select * from book";
				rs=statement.executeQuery(s1);
				while(rs.next());
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getDouble(5));
				}
				break;
				
		   default:
			   System.out.println("invalid Choice");
			}
		}while(ch <= 5);
		connection.close();
	}
}
