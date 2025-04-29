import java.util.Scanner;

public class p21_pallindrome{
    void is_pallindrome(String s){
        int l=s.length();
        String rev="";
        while(l!=0){
            rev=rev+s.charAt(l-1);
            l--;
        }
        if(s.equals(rev)){
            System.out.println("The string is pallindrome");
        }
        else{
            System.out.println("The string is not pallindrome");
        }
    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        p21_pallindrome obj=new p21_pallindrome();
        obj.is_pallindrome(s);
        sc.close();
    }
}