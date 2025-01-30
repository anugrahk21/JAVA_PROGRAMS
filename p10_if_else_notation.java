import java.util.Scanner;
public class p10_if_else_notation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter two integers: ");
            int k=sc.nextInt();
            int h=sc.nextInt();
            String s=(((k+h)%(h*k))==0?"Sum is Multiple of Product":"Sum is Not Multiple of Product");
            System.out.println(s);
        }
        catch(Exception e){
            sc.close();
            System.out.println("Invalid input.");
        }
    }
}