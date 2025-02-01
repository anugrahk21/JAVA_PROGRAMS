import java.util.Scanner;
class sum_of_elements{
    public static int sum_elements(int...a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum of elements is:"+sum_elements(arr));
        sc.close();
    }
}