package finance;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        // Get the number of hours worked
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get the hourly pay rate
        System.out.println("What is your pay rate?");
        double payRate = scanner.nextDouble();

        scanner.close();

        //Multiply hours and pay rate
        double grossPay = hours * payRate;

        //Display result
        System.out.println("Gross pay: " + grossPay);
    }
}
