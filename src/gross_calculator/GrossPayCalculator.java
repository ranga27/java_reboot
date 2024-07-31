package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        int hours = 0;
        System.out.println("How many hours did yuo work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        double payRate = 0;
        System.out.println("What is your payrate?");
        payRate = scanner.nextDouble();
        scanner.close();
        double grossPay = hours * payRate;
        System.out.println("Gross pay: " + grossPay);
    }
}
