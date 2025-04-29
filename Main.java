import java.util.Scanner;
// program to demonstrate encapsulation
//here 
class p27_encapsulation_1{
    private int k; // private variable
    public void run(){ // public method because static can't access private variables
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt(); //we are able to access the private variable k here because it is in the same class
        System.out.println("The number is: "+k);
        sc.close();
    }  
}

public class Main {
    public static void main(String[] args) {
        p27_encapsulation_1 obj = new p27_encapsulation_1(); //creating object of class p27_encapsulation_1
        obj.run(); //calling the method run
    }
}
