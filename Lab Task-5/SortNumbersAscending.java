import java.util.Scanner;

public class SortNumbersAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        // Create an array of the given size
        int[] numbers = new int[size];

        // Ask the user to input the numbers for the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Bubble sort to arrange numbers in ascending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("The numbers in ascending order are:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
