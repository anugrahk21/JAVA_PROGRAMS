import java.util.Scanner;

//here, we implement the concept of nested class + inheritance

class p29_inheritance_2{
    class Bank_ACC{
        int accno;
        String name;
        int balance;
        Bank_ACC(int accno,String name,int balance){
            this.accno=accno;
            this.name=name;
            this.balance=balance;
        }
    }
    class Savings_ACC extends Bank_ACC{
        int bal=0;
        Savings_ACC(int accno,String name,int balance){
            super(accno, name, balance);
            this.bal=balance;
        }
        void deposit(int amount){
            balance+=amount;
        }
        void withdraw(int amount){
            if(balance<amount){
                System.out.println("Insufficient Balance");
            }
            else{
                balance-=amount;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number, Name and Balance");
        int accno=sc.nextInt();
        String name=sc.next();
        int balance=sc.nextInt();
        p29_inheritance_2 outer=new p29_inheritance_2();
        Savings_ACC obj=outer.new Savings_ACC(accno, name, balance);
        System.out.println("Enter Amount to Deposit");
        int amount=sc.nextInt();
        obj.deposit(amount);
        System.out.println("Enter Amount to Withdraw");
        amount=sc.nextInt();
        obj.withdraw(amount);
        System.out.println("Balance: "+obj.balance);
        sc.close();
    }
} 