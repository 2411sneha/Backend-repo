import java.util.*;
 class vehicle
 {
    int vid;
    String vname,color;
    double price;
    vehicle()
    {
        vid=201;
        vname="honda";
        color="black";
        price=78000;
        // Scanner sc=new Scanner (System.in);
		// System.out.println("Enter vehicle id ,name,color& price");
		// vid=sc.nextInt();
		// vname=sc.next();
		// color=sc.next();
        // price=sc.nextDouble();
    }
    void display()
    {
        System.out.println("vehicle id="+vid);
        System.out.println("vehicle name="+vname);
        System.out.println("vehicle author="+color);
        System.out.println("vehicle price="+price);
    }
 }
public class vehicle_22sep
{
    public static void main(String[] args)
    {
        vehicle v1=new vehicle();
        v1.display();
        vehicle v2=new vehicle();
        v2.display();
    }
}