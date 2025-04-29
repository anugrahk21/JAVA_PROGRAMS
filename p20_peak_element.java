import java.util.Scanner;
class p20_peak_element{
    Scanner sc=new Scanner(System.in);
    void print_peak(int arr[],int n){
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i]>=arr[i+1]){
                    System.out.println("Peak element is "+arr[i]);
                }
            }
            else if(i==n-1){
                if(arr[i]>=arr[i-1]){
                    System.out.println("Peak element is "+arr[i]);
                }
            }
            else{
                if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]){
                    System.out.println("Peak element is "+arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        p20_peak_element obj=new p20_peak_element();
        System.out.println("Enter the number of elements in the array: ");
        int n = obj.sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=obj.sc.nextInt();
        }
        obj.print_peak(arr,n);
        obj.sc.close();
        
        
    }
}