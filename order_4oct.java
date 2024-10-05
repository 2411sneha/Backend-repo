import java.lang.String;
import java.util.*;


abstract class order
{
    int id;
    String description;
    order(int id,String description)
    {
        this.id=id;
        this.description=description;
    }
    abstract void display();
}
class PurchaseOrder extends order
{
    String ven_name;
    PurchaseOrder(int id,String description,String ven_name)
    {
        super(id, description);
        this.ven_name=ven_name;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id = ");
        this.id=sc.nextInt();
        System.out.println("Enter description of order = ");
        this.description=sc.next();
        System.out.println("Enter Vendor name = ");
        this.ven_name=sc.next();
    }
    @Override
    public void display()
    {
        System.out.println("Id ="+this.id);
        System.out.println("Description of order ="+ this.description);
        System.out.println("Vendor Name ="+ this.ven_name);
    }
}
class SalesOrder extends order
{
    String cust_name;
    SalesOrder(int id,String description,String cust_name)
    {
        super(id, description);       
        this.cust_name=cust_name;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id = ");
        this.id=sc.nextInt();
        System.out.println("Enter description of order = ");
        this.description=sc.next();
        System.out.println("Enter Customer name = ");
        this.cust_name=sc.next();
    }
    public void display()
    {
        System.out.println("Id ="+this.id);
        System.out.println("Description of order ="+this.description);
        System.out.println("Customer Name ="+this.cust_name);
    }
}

public class order_4oct
{
    public static void main(String[] args)
    {
        int id = 0;
        String description="",ven_name="",cust_name="";
        PurchaseOrder p=new PurchaseOrder(id,description,ven_name);
        p.accept();
        p.display();
        SalesOrder s=new SalesOrder(id,description,cust_name);
        s.accept();
        s.display();
    }
}

/* 
Enter your id = 
2
Enter description of order = 
mobile
Enter Vendor name =
sneha
Id =2
Description of order =mobile
Vendor Name =sneha
Enter your id =
5
Enter description of order =
fridge
Enter Customer name =
pranav
Id =5
Description of order =fridge
Customer Name =pranav
*/