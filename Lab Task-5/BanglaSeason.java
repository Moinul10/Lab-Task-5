import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask for the month number
        System.out.print("Enter the month number (1-12): ");
        int month = input.nextInt();
        
        // Determine the Bangla season using if-else
        if (month == 1 || month == 2) {
            System.out.println("Season:Summer (Grishmo) ");
        } else if (month == 3 || month == 4) {
            System.out.println("Season: Monsoon (Bhorsha)");
        } else if (month == 5 || month == 6) {
            System.out.println("Season: Autumn (Shorot)");
        } else if (month == 7 || month == 8) {
            System.out.println("Season:Late Autumn (Hemonto) ");
        } else if (month == 9 || month == 10) {
            System.out.println("Season:Winter (Sheat)");
        } else if (month == 11 || month == 12) {
            System.out.println("Season: Spring (Boshonto)");
        } else {
            System.out.println("Invalid month number!");
        }
    }
}
