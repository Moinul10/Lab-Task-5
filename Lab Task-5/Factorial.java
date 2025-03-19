import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        long factorial = 1;
        
        // Calculate factorial
        for (int i = 1; i <= n; i++) {
            factorial = factorial* i;
        }
        
        // Display the result
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
