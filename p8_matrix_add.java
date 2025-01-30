import java.util.Scanner;
public class p8_matrix_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the square matrix size: ");
            int s1 = sc.nextInt();
            int s2 = s1;
            int arr1[][] = new int[s1][s1];
            int arr2[][] = new int[s2][s2];

            System.out.println("Enter the elements of 1st matrix: ");
            for (int i = 0; i < s1; ++i) {
                for (int j = 0; j < s1; ++j) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of 2nd matrix: ");
            for (int i = 0; i < s1; ++i) {
                for (int j = 0; j < s1; ++j) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            int arr3[][] = new int[s1][s2];
            for (int i = 0; i < s1; ++i) {
                for (int j = 0; j < s1; ++j) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            
            System.out.println("Sum of matrix: ");
            for (int i = 0; i < s1; ++i) {
                for (int j = 0; j < s1; ++j) {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch(Exception e){
            sc.close();
            System.out.println("Invalid input.");
        }
    }
}