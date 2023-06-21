import java.util.*;
public class atm {
    public static void main(String args[]){
        int balance=100000;
        int withdrawal, deposit, count=1;
        try{
            Scanner sc=new Scanner(System.in);
            int pin=2864;
            System.out.println("Enter your user ID:");
            String userid=sc.next();
            if(userid.length()==6){
                System.out.println("Welcome to our ATM services =>"+userid);
                System.out.println("Enter your PIN to continue:");
                int user_p=sc.nextInt();
                if(user_p!=pin){
                   while(true){
                       System.out.println("Entered PIN is incorrect.");
                       count++;
                       System.out.println("Enter your correct PIN: ");
                       user_p=sc.nextInt();
                       if(user_p==pin){
                           break;
                       }
                       if(count==5){
                           System.out.println("The limit has been exceeded. Try again later");
                           break;
   
                       }
                   }
               }
               if(user_p==pin){
                   System.out.println();
                   System.out.println("Choose your ATM service.");
                   System.out.println("1. Balance enquiry");
                   System.out.println("2. Money Withdrawal");
                   System.out.println("3. Deposit amount");
                   System.out.println("4. Transfer amount to another account");
                   System.out.println("5. quit");
                   System.out.println();
                   System.out.println("Please select your service option:");
                   int opt=sc.nextInt();
                   switch(opt){
                       case 1: System.out.println("The current balance in your account is:" +balance);
                               System.out.println();
                               break;
                       case 2: System.out.println("Enter amount of cash to withdraw:");
                               withdrawal=sc.nextInt();
                               if(withdrawal>balance || balance==0){
                                   System.out.println("Your account have insufficient balance.");
                                   System.out.println();
                                   break;
                               }
                               System.out.println("The withdrawal has been processed.");
                               System.out.println();
                               balance=balance-withdrawal;
                               break;
                       case 3: System.out.println("Enter amount to deposit:");
                               deposit=sc.nextInt();
                               System.out.println("Your amount is deposited successfully.");
                               balance=balance+deposit;
                               System.out.println("Your current account balance is:" +balance);
                               System.out.println();
                               break;
                       case 4: System.out.println("Enter the bank account number to transfer amount.");
                               String acc_no=sc.next();
                               if(acc_no.length()==10){
                                   System.out.println("Enter amount to transfer");
                                   int amt=sc.nextInt();
                                   if(amt<=balance){
                                       System.out.println("Amount is transferred successfully.\n");
                                       balance=balance-amt;
                                       System.out.println("Your current account balance is:" +balance);
                                   } 
                                   else{
                                       System.out.println("Your account have insufficient funds. Try transfering within your balance.");
                                   }
                               }
                               else{
                                   System.out.println("Enter a valid bank account number");
                               }
                               System.out.println();
                               break;
                       case 5: System.out.println("ThankYou for utilising ATM services. Hope you visit again!!!");
                               System.out.println();
                               break;
                       default:
                               System.out.println("Invalid Option. Try again!!");
                   }
               }
            }
            else{
                System.out.println("Invalid user id. Try again!!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
