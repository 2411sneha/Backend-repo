import java.util.*;

public class book_18sep 
{
    int bid;
    String bname,author;
    float price;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter book id,name,author and price=");
        bid=sc.nextInt();
        bname=sc.next();
        author=sc.next();
        price=sc.nextFloat();
    }
    void display()
    {
        System.out.println("Book id="+bid);
        System.out.println("Book name="+bname);
        System.out.println("Book author="+author);
        System.out.println("Book price="+price);
    }

    public static void main(String[] args) 	
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Books=");
		n=sc.nextInt();
		book_18sep s1[]=new book_18sep [n];//Array creation
		for(i=0;i<n;i++)
		{
			s1[i]=new book_18sep();//object creation
			s1[i].accept();
			s1[i].display();
		}
    }				
}

/*
Enter no of Books=
2
enter book id,name,author and price=
155
abc
ahd
125.03
Book id=155
Book name=abc
Book author=ahd
Book price=125.03
enter book id,name,author and price=
789
hdp
siee
4580.3
Book id=789
Book name=hdp
Book author=siee
Book price=4580.3
*/