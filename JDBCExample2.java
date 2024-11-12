package com.oit;
import java.sql.*;
import java.util.*;

public class JDBCExample2 {

	public static void main(String[] args)throws SQLException,ClassNotFoundException
	{
		int id,ch,id1;
		String name,s1;
		double per;
		ResultSet rs;
		
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Register");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","root2411");
		System.out.println("Connection Success");
		Statement statement= connection.createStatement();
		
		do {
			System.out.println("1: Save \n2: Delete \n3: Update \n4: Read all data \n5: Search data");
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter id,name and percentage : ");
				id=sc.nextInt();
				name=sc.next();
				per=sc.nextDouble();
				s1="insert into student values("+id+",'"+name+"',"+per+")";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("Save success");
				else
					System.out.println("Save unsuccess");
				break;
			
			case 2:
				System.out.println("Enter id : ");
				id=sc.nextInt();
				s1="delete from student where id = "+id+" ";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("delete success");
				else
					System.out.println("delete unsuccessful");
				break;
				
			case 3:
				System.out.println("Enter id,name and percentage : ");
				id=sc.nextInt();
				name=sc.next();
				per=sc.nextDouble();
				s1="update student set name='"+name+"',per="+per+" where id="+id+"";
				id1=statement.executeUpdate(s1);
				if(id1 > 0)
					System.out.println("Update success");
				else
					System.out.println("Update unsuccess");
				break;
				
			case 4:
				s1="select * from student";
				rs=statement.executeQuery(s1);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				}
				break;
				
			case 5:
				System.out.println("Enter id = ");
				id=sc.nextInt();
				s1="select * from student where id="+id+"";
				rs=statement.executeQuery(s1);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				}
				break;
				
			default :
				System.out.println("Invalid Choice");
			}
		}while(ch <= 5);
		
		connection.close();
		statement.close();
	}

}


/*
Driver Register
Connection Success
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
1
Enter id,name and percentage : 
54
sneha
85
Save success
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
1
Enter id,name and percentage : 
45
shruti
96
Save success
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
1
Enter id,name and percentage : 
23
yogita
90
Save success
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
1
Enter id,name and percentage : 
3
priyanka
96
Save success
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
1
Enter id,name and percentage : 
23
harshda
93
Save success
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
4
54	sneha	85.0
45	shruti	96.0
23	yogita	90.0
3	priyanka	96.0
23	harshda	93.0
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
2
Enter id : 
54
delete success
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
4
45	shruti	96.0
23	yogita	90.0
3	priyanka	96.0
23	harshda	93.0
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
3
Enter id,name and percentage : 
54
sneha
98
Update unsuccess
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
4
45	shruti	96.0
23	yogita	90.0
3	priyanka	96.0
23	harshda	93.0
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
5
Enter id = 
23
23	yogita	90.0
23	harshda	93.0
1: Save 
2: Delete 
3: Update 
4: Read all data 
5: Search data
Enter your choice : 
8
Invalid Choice

*/