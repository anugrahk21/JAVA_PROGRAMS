import java.util.Scanner;
public class p13_leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)==true){
            System.out.println(year+" is a Leap Year");
        }
        else{
            System.out.println(year+" is not a Leap Year");
        }
        sc.close();
    }
}