package dieGame;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        int currentSpace = 0;
        int lastSpace = 20;
        int maxRolls =5;
        Random random = new Random();

        int diff = lastSpace;
        System.out.println("Welcome to Roll the Die! Let's begin...");
        for (int i = 1; i <= maxRolls; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.printf("Roll #%d: You've rolled a %d.", i,die);

            diff = lastSpace - currentSpace;
            if (currentSpace <lastSpace) {
            System.out.println("You are now on space " + currentSpace + " and have " + diff + " more to go.");
            } else if (currentSpace > lastSpace) {
                System.out.println("You are now on space " + currentSpace + " and have crossed 20! Sorry Game Over!");
                break;
            } else {
                System.out.println("You are now on space " + currentSpace + " and have won!");
                break;
            }
        }
    }
}
