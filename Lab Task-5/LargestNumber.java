import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        // Create an array of the given size
        int[] numbers = new int[size];

        // Ask the user to input the numbers for the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Initialize the largest number as the first element
        int largest = numbers[0];

        // Traverse through the array to find the largest number
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display the largest number
        System.out.println("The largest number is: " + largest);

    }
}
