import java.util.Scanner;
public class p2_datatypes {
    public static void main(String args[]){
        Scanner obj=null;
        try{
            char a='a';
            int i=20;
            float f=2.1f;
            byte b=5;
            short s=66;
            double d=6.1234567;
            long l=9876543;

            obj=new Scanner(System.in);
            System.out.println("Enter an integer and a character: ");
            int k=obj.nextInt();
            char c=obj.next().charAt(0);
            System.out.println("Integer Value: "+k);
            System.out.println("Character Value: "+c);

            System.out.println("Char : "+a);
            System.out.println("Integer : "+i);
            System.out.println("Float : "+f);
            System.out.println("Byte : "+b);
            System.out.println("Short : "+s);
            System.out.println("Double : "+d);
            System.out.println("Long : "+l);
        }
        finally{
            obj.close();
            System.out.println("program ended");
        }

    }
    
}
