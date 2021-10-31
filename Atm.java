package Javaproject;
 //import required classes and packages   
    import java.util.Scanner;  
      
    //create ATMExample class to implement the ATM functionality  
    public class Atm  
    {  
        //main method starts   
        public static void main(String args[] )  
        {  
            //declare and initialize balance, withdraw, and deposit  
            int balance = 500, withdraw, deposit;  
              
            //create scanner class object to get choice of user  
            Scanner sc = new Scanner(System.in);  
              
            while(true)  
            {  
                System.out.println("\n------------ ATM Machine -----------\n");  
                System.out.println("1. Withdraw Amount\n");  
                System.out.println("2. Deposit Amount\n");  
                System.out.println("3. Check Balance\n");  
                System.out.println("4. EXIT\n");  
                System.out.print("Choose the operation:\n");  
                  
                //get choice from user  
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
            System.out.print("Enter money to be withdrawn:\n");  
                          
            //get the withdrawl money from user  
            withdraw = sc.nextInt();  
                          
            //check whether the balance is greater than or equal to the withdrawal amount  
            if(balance >= withdraw)  
            {  
                //remove the withdrawl amount from the total balance  
                balance = balance - withdraw;  
                System.out.println("PLEASE COLLECT YOUR AMOUNT\n");  
            }  
            else  
            {  
                //show custom error message   
                System.out.println("INSUFFICIENT BALANCE\n");  
            }  
            System.out.println("THANK YOU");  
            break;  
       
                    case 2:  
                          
            System.out.print("Enter amount to be deposited:\n");  
                          
            //get deposite amount from te user  
            deposit = sc.nextInt();  
                          
            //add the deposit amount to the total balanace  
            balance = balance + deposit;  
            System.out.println("YOUR MONEY HAS BEEN SUCESSFULLY DEPOSITED\n");  
            System.out.println("");  
            break;  
       
                    case 3:  
            //displaying the total balance of the user  
            System.out.println("Balance : "+balance);  
            System.out.println("");  
            break;  
       
                    case 4:  
            //exit from the menu  
            System.exit(0);  
                }  
            }  
        }  
    }  