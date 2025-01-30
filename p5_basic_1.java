import java.util.Scanner;
public class p5_basic_1 {
    public static void main(String[] args) {
        Scanner obj=null;
        try{
            obj=new Scanner(System.in);
            System.out.println("Enter the number of items: ");
            int a=obj.nextInt();
            System.out.println("Enter the cost of each item: ");
            int b=obj.nextInt();
            int tcost=b*a;
            int t;
            if(tcost<=1000){
                t=1;
            }
            else if(tcost>=1000 && tcost<=5000){
                t=2;
            }
            else{
                t=3;
            };
            
            String abc="";
            switch(t){
                case 1:
                    abc="Payment by cash or check is recommended.";
                    break;
                case 2:
                    abc="Payment by credit card is recommended.";
                    break;
                case 3:
                    abc="Payment by bank transfer is recommended.";
                    break;
            };
            
            System.out.println("Total Cost: "+tcost);
            System.out.println("Payment Method Suggestion: "+abc);
        }
        finally{
            obj.close();
        }
    }
}