import java.util.Scanner;
public class p14_largest_smallest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
            smallest = Math.min(smallest, numbers[i]);
        }
        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        scanner.close();
    }
}