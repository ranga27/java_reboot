package creditCheck;

import java.util.Scanner;

public class Instant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int s = in.nextInt();
        System.out.print("Enter credit score: ");
        int c = in.nextInt();
        if (passCreditCheck(s,c)) System.out.println("Passed credit check");
        else System.out.println("Failed credit check");

    }
    public static boolean passCreditCheck(int salary, int creditScore){
                return (salary > 25000 && creditScore >= 700);
    }
}
