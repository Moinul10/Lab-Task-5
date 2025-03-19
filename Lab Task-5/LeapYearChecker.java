import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        // Ask the user to enter a year
        System.out.print("Enter a year : ");
         year = input.nextInt();
        
        // Check if the year is a leap year
        boolean LeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Display the result
        if (LeapYear) {
            System.out.println(year+ " is a leap year.");
        } else {
            System.out.println( year+" is not a leap year.");
        }
        
    }
}

