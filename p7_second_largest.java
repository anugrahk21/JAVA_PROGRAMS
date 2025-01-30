import java.util.Scanner;
public class p7_second_largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int k=sc.nextInt();
            int arr[] = new int[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();
            }
            int max1=arr[0];
            int max2=arr[1];
            for(int i=0;i<k;++i){
                if(arr[i]>max1){
                    max2=max1;
                    max1=arr[i];
                }
                else if(arr[i]>max2 && arr[i]!=max1){
                    max2=arr[i];
                }
            }
            System.out.println("Second Largest Element: "+max2);
    
        }
        catch(Exception e){
            sc.close();
            System.out.println("Invalid Input");
        }
    }
}