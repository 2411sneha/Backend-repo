package com.oit;
import java.sql.*;
import java.util.*;

public class JDBCExample6 
{

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		int eid = 0,ch,id1;
		String ename,designation,email,s1;
		float salary;
		ResultSet rs;
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");
		System.out.println("Connection success");
		Statement statement=connection.createStatement();
		do
		{
			System.out.println("1:Save\n2:Delete\n3:Update\n4:Read All Data\n5:Search Data");
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
			
			case 1:
				System.out.println("Enter id,employee name,salary,designation and email : ");
				eid=sc.nextInt();
				ename=sc.next();
				salary=sc.nextFloat();
				designation=sc.next();
				email=sc.next();
				s1="insert into employee values("+eid+",'"+ename+"',"+salary+",'"+designation+"','"+email+"')";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("data save successfully");
				else
					System.out.println("data save unsuccessfully");
				break;
				
			case 2:
				System.out.println("Enter id : ");
				eid=sc.nextInt();
				s1="delete from employee where eid="+eid+" ";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("Deleted successfully");
				else
					System.out.println("Deleted unsuccessfully");
				break;
				
			case 3:
				System.out.println("Enter salary : ");
				salary=sc.nextFloat();
				s1="update employee set salary="+salary+"";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("Update successfully");
				else
					System.out.println("Unsuccessful update");
				break;
				
			case 4:
				s1="select * from employee";
				rs=statement.executeQuery(s1);
				while(rs.next());
				{
					System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
				}
				break;
				
			default :
				System.out.println("Invalid Choice");
			}
		}while(ch <= 5);
		connection.close();
	}
}
