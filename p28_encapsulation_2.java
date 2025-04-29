import java.util.Scanner;

class p28_encapsulation_2{
    class Bank_account{
        private int accid;
        private String name;
        private int accno;
        private int contactno;

        public Bank_account(int accid, String name, int accno, int contactno){
            this.accid = accid;
            this.name = name;
            this.accno = accno;
            this.contactno = contactno;
        }


    }
    class ShowDetails{
        public void ShowDetails(){
            System.out.println("Account id: "+accid);
            System.out.println("Name: "+name);
            System.out.println("Account number: "+accno);
            System.out.println("Contact number: "+contactno);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account id: ");
        int accid=sc.nextInt();
        System.out.println("Enter the name: ");
        String name=sc.next();
        System.out.println("Enter the account number: ");
        int accno=sc.nextInt();
        System.out.println("Enter the contact number: ");
        int contactno=sc.nextInt();
        p28_encapsulation_2 A=new p28_encapsulation_2();
        Bank_account B=A.new Bank_account(accid,name,accno,contactno);
        S.ShowDetails();
        sc.close();
    }

}