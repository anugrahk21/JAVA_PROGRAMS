import java.util.Scanner;
public class p9_prime_no{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter a integer: ");
            int k=sc.nextInt();
            boolean p=true;
            if(k==1){
                p=false;
                System.out.println("Not a prime.");
            }
            for(int i=2;i<k-1;++i){
                if(k%i==0){
                    System.out.println("Not a prime.");
                    p=false;
                    break;
                }
            }
            if(p==true){
                System.out.println("Prime.");
            }
        }
        catch(Exception e){
            sc.close();
            System.out.println("Invalid input.");
        }
    }
}