import java.util.Scanner;

class p19_reverse_array{
    Scanner sc=new Scanner(System.in);
    void reverse(int arr[],int n){
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.err.println("Reversed array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        p19_reverse_array obj=new p19_reverse_array();
        System.out.println("Enter the number of elements in the array : ");
        int n=obj.sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=obj.sc.nextInt();
        }
        obj.reverse(arr,n);
        obj.sc.close();
    }
}