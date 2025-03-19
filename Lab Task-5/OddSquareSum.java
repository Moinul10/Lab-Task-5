import java.util.Scanner;

public class OddSquareSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();
        
        int sum = 0;
        int oddNumber = 1;
        
        // Calculate the sum of squares of first n odd numbers
        for (int i = 0; i < n; i++) {
            sum = sum + oddNumber * oddNumber;
            oddNumber =oddNumber + 2; // Move to the next odd number
        }
        
        // Display the result
        System.out.println("Sum of the series: " + sum);
    }
} 