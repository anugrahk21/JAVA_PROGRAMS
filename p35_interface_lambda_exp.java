// Java program to demonstrate the use of lambda expressions with interfaces

//Only one method can be defined in the interface
// It is called functional interface
interface Calculator{
    void function(int a,int b);
}

class p35_interface_lambda_exp{
    public static void main(String[] args){

        // Using lambda expression to implement the interface
        Calculator c1=(a,b)->System.out.println("Addition is: "+(a+b));
        c1.function(10,20);

        c1=(a,b)->System.out.println("Subtraction is: "+(a-b));
        c1.function(20,10);

        c1=(a,b)->System.out.println("Multiplication is: "+(a*b));
        c1.function(10,20);

        c1=(a,b)->System.out.println("Division is: "+(a/b));
        c1.function(20,10);
    }
}