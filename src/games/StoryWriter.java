package games;

import java.util.Scanner;

public class StoryWriter {
    public static void main(String[] args) {
        System.out.println("Lets write a story, provide a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        System.out.println("Describe your feelings about the season in one word");
        String feelings = scanner.next();
        System.out.println("How many cups of coffee you drink during the " + season + " ?");
        int cups = scanner.nextInt();
        System.out.println("The story comes out like this: On a(n) " + feelings + " " + season+ " day, I drink a minimum of " + cups + " of coffee.");
        scanner.close();
    }
}
