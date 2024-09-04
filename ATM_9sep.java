import java.util.*;
public class ATM
{
    public static void main(String[] args)
    {
        int balance=25000,cpin=2411,count=0,choice=0;
        Scanner sc=new Scanner(System.in);
        
        while(count<3)
        {
            do
            {
                System.out.println("Enter your pin= ");
                int pin;
                pin=sc.nextInt();
                if(cpin==pin)
                {
                    System.out.println("1.Saving Account \n2.Current Account");
                    System.out.println("Enter your account type:");
                    choice=sc.nextInt();
                    switch(choice)
                    {
						
                        case 1:System.out.println("Saving Account");
                            System.out.println(
                                    "Select your choice:\n1: Show Balance \n2: Withdraw \n3: Deposit \n4: Change pin \n5: Interest calculation");
                            System.out.println("Enter your choice=");
                            choice=sc.nextInt();
                            switch(choice)
                            {
                                case 1:System.out.println("Balance");
                                System.out.println("Your current account balance ="+balance);
                                break;
                                
                                case 2:System.out.println("Withdrawl Amount");
                                System.out.println("Enter withdrawl amount=");
                                int withdraw;
                                withdraw=sc.nextInt();
                                if(withdraw > balance)
                                {
                                    System.out.println("Insufficient Balance...");
                                }
                                else
                                {
                                    balance -= withdraw;
                                    System.out.println("withdraw amount successfully...");
                                    System.out.println("Current balance="+balance);
                                }
                                break;
                                
                                case 3:System.out.println("Deposit Amount");
                                System.out.println("Enter deposit amount =");
                                int deposit;
                                deposit=sc.nextInt();
                                balance += deposit;
                                System.out.println("Your amount deposited successfully...");
                                System.out.println("Current Balance="+balance);
                                break;
                                
                                case 4:System.out.println("Change pin");
                                    System.out.println("Enter new pin:");
                                    int npin = sc.nextInt();

                                    cpin = npin;

                                    System.out.println("Pin update successful");
                                    break;
                                
                                case 5:System.out.println("Interest Calculation");
                                double interest=balance * 0.07;
                                System.out.println("Total Interest="+interest);
                                break;
                            }
						
                            break;
							
                            
                            case 2:System.out.println("Current Account");
                                System.out.println(
                                    "Select your choice: \n1: Show Balance \n2: Withdraw \n3: Deposit \n4: Change pin \n5: Interest calculation");
                            System.out.println("Enter your choice=");
                            choice=sc.nextInt();
                            switch(choice)
                            {
                                case 1:System.out.println("Balance");
                                System.out.println("Your current account balance ="+balance);
                                break;
                                
                                case 2:System.out.println("Withdrawl Amount");
                                System.out.println("Enter withdrawl amount=");
                                int withdraw;
                                withdraw=sc.nextInt();
                                if(withdraw > balance)
                                {
                                    System.out.println("Insufficient Balance...");
                                }
                                else
                                {
                                    balance -= withdraw;
                                    System.out.println("withdraw amount successfully...");
                                    System.out.println("Current balance="+balance);
                                }
                                break;
                                
                                case 3:System.out.println("Deposit Amount");
                                System.out.println("Enter deposit amount =");
                                int deposit;
                                deposit=sc.nextInt();
                                balance += deposit;
                                System.out.println("Your amount deposited successfully...");
                                System.out.println("Current Balance="+balance);
                                break;
                                
                                case 4:System.out.println("Change pin");
                                    System.out.println("Enter new pin:");
                                    int npin = sc.nextInt();

                                    cpin = npin;

                                    System.out.println("Pin update successful");
                                    break;
                                
                                case 5:System.out.println("Interest Calculation");
                                double interest=balance * 0.07;
                                System.out.println("Total Interest="+interest);
                                break;
                            }
                            break;
                    }
                    break;
                }
                
                else
                {
                   System.out.println("Invalid pin...");
                   count++;
                   if(count==3)
                   {
                       System.out.println("Card Blocked");
                   }
                }
            }
            while(choice<=5);
        }
    }
}