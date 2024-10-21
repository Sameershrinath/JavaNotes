import java.util.Scanner;

public class ATM_machine {
    static int pin=1234;
    static int accountbalance=10000;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter you atm pin");
        if (sc.hasNextInt()) {
            int userPin = sc.nextInt();
            if (userPin== pin) {
                System.out.println("Your entered the valid pin");
                System.out.println("Please Enter the amount to withdraw ");
                if(sc.hasNextInt()){
                    int amount=sc.nextInt();
                    if (amount<=accountbalance) {
                        double remainingBalance=accountbalance-amount;
                        
                        System.out.println("Please collect your money");
                        System.out.println("Your remaining balance is "+remainingBalance);
                        
                    }
                    else{
                        System.out.println("please enter the valid amount to withdraw");
                    }
                }
                
                
                
            }
            else{
                System.out.println("Your pin is not matched");
            }
            
        }
    }
    
}
