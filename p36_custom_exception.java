//Program to demonstrate the use of custom exception and assertion.

import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class p36_custom_exception {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        // Demonstrate assertion
        assert age >= 0 : "Age cannot be negative.";

        try{
            if(age>18){
                System.out.println("You are eligible to vote.");
            }
            else{
                throw new InvalidAgeException("You are not eligible to vote.");
            }
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Thank you for using our service.");
        }
    }
}