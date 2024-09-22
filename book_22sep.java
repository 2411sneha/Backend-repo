import java.util.*;
 class book
 {
    int bid;
    String bname,author;
    double price;
    book()
    {
        bid=201;
        bname="Agnipanth";
        author="Dr.Abdul Kalam";
        price=500;
        // Scanner sc=new Scanner (System.in);
		// System.out.println("Enter book id ,name,author& price");
		// bid=sc.nextInt();
		// bname=sc.next();
		// author=sc.next();
        // price=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Book id="+bid);
        System.out.println("Book name="+bname);
        System.out.println("Book author="+author);
        System.out.println("Book price="+price);
    }
 }
public class book_22sep
{
    public static void main(String[] args)
    {
        book b1=new book();
        b1.display();
        book b2=new book();
        b2.display();
    }
}