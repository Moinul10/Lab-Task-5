import java.util.Scanner;

public class AltSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the number of terms
        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();
        
        int sum = 0;
        
        // Calculate the alternating sum series
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i; // Subtract even numbers
            } else {
                sum += i; // Add odd numbers
            }
        }
        
        // Display the result
        System.out.println("Sum of the series: " + sum);
    }
}

