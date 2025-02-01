import java.util.Scanner;
class p16_bank_system{// If we declare a class as private, it can't be accessed by other classes in the same file or other files.
// However, top-level classes cannot be declared as private in Java. They can only be public or package-private (default).
    int accno;
    String name;
    float balance;
    public void Deposit(float amount){
        balance+=amount;
        System.out.println("Amount Deposited Successfully");
    }
    public void Withdraw(float amount){
        if(balance<amount){
            System.out.println("Insufficient Balance");
            return;
        }
        balance-=amount;
        System.out.println("Amount Withdrawn Successfully");
    }

}
class user_details_entry{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        p16_bank_system b=new p16_bank_system();
        System.out.println("Enter Account Number");
        b.accno=sc.nextInt();
        System.out.println("Enter Name");
        b.name=sc.next();
        System.out.println("Enter Balance");
        b.balance=sc.nextFloat();
        System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
        int options=sc.nextInt();
        float amount;
        switch(options){
            case 1:
                System.out.println("Enter Amount to Deposit");
                amount=sc.nextFloat();
                b.Deposit(amount);
                System.out.println("New Balance: "+b.balance);
                break;
            case 2:
                System.out.println("Enter Amount to Withdraw");
                amount=sc.nextFloat();
                b.Withdraw(amount);
                System.out.println("New Balance: "+b.balance);
            case 3:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid option");
        }
        sc.close();
    }
}