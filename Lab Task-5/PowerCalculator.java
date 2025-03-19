import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask the user for the base and exponent
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        // Calculate the power using Math.pow() function
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);
        
    }
}
