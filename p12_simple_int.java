import java.util.Scanner;
class Abc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the Principal Amount: ");
            int p=sc.nextInt();
            System.out.println("Enter the Rate of Interest: ");
            float r=sc.nextFloat();
            System.out.println("Enter the Time Period: ");
            int t=sc.nextInt();
            float si=(p*r*t)/100;
            System.out.printf("Simple Interest: %.2f\n",si); //printf is used to print the output in a formatted way
            System.out.printf("Total Amount: %.2f",(p+si)); //%.2f is used to print the output up-to 2 decimal places
            
            }
        catch(Exception e){
            sc.close();
            System.out.println("Invalid Input");
        }
    }
}