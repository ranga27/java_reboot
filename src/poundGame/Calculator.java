package poundGame;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Pound Game! Your goal is to enter enough change to make exactly £1.00");
        System.out.println("Enter your number of 1 pence");
        Scanner scanner = new Scanner(System.in);
        int onePence = scanner.nextInt();
        System.out.println("Enter your number of 2 pences");
        int twoPences = scanner.nextInt();
        System.out.println("Enter your number of 5 pences");
        int fivePences = scanner.nextInt();
        System.out.println("Enter your number of 10 pences");
        int tenPences = scanner.nextInt();
        System.out.println("Enter your number of 20 pences");
        int twentyPences = scanner.nextInt();
        System.out.println("Enter your number of 50 pences");
        int fiftyPences = scanner.nextInt();
        double total = onePence + twoPences * 2 + fivePences * 5 + tenPences * 10 + twentyPences * 20 + fiftyPences * 50;
        if (total == 100) {
            System.out.println("Yay! That's exactly £1.00! You win!");
        } else System.out.println("Sorry, you lost! Your total " + total/100 + " Try again");
    }
}
