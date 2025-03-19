import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double C,F;
        System.out.print("Enter temperature in Fahrenheit : ");
        F =input.nextDouble();
        C = (F-32) * 5/9;
        System.out.println("Temperature in Celsius :"+C);
    }
}
