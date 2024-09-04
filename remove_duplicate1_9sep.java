import java.util.Scanner;
public class remove_duplicate1
{
	public static void main(String[] args)
	{
		int n,i;
        int counted=-1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size =");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are =");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.print("\n remove Duplicate numbers from array :");
		int uni[]=new int[n];
        for(i=0;i<n;i++)
        {
            if(a[i] != counted)
            {
                uni[i] = a[i];
            }
        }
        System.out.println("unique elements array :");
        for(i=0;i<n;i++)
        {
            if(uni[i] != 0)
            {
                System.out.print(uni[i]+" ");
            }
        }
            
        
	}
}