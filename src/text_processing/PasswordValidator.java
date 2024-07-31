package text_processing;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        String username = "johndoe";
        String password = "ABC_1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new password (at least 8 characters long, must have at least one uppercase letter and a special character. Is not same as the username or the old password: ");
        String newPassword = sc.nextLine();
        if (newPassword.equalsIgnoreCase(password)) {
            System.out.println("Password can not be the same as the old password");
        }
        else if (newPassword.toLowerCase().contains(username.toLowerCase())) {
            System.out.println("Password can not contain username");
        }
        else if (newPassword.length() < 8) {
            System.out.println("Password must be at least 8 characters long");
        }
        else if (!hasUpperCase(newPassword))
        {
            System.out.println("Password must have uppercase letter");
        }
    }

    private static boolean hasUpperCase(String newPassword) {
        boolean hasUpperCase = false;
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isUpperCase(newPassword.charAt(i))) {
                hasUpperCase = true;
                break;
            }
        }
        return hasUpperCase;
    }

}
