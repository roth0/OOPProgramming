package passwordsystem; 

import java.util.Scanner; // Imports the Scanner class for input

public class PasswordSystem { 
    public static void main(String[] args) { 
        Scanner passW = new Scanner(System.in); // for user input
        String correctPassword = "password123"; // Sets the correct password
        int maxAttempts = 3; // Defines the maximum number of attempts allowed

        for (int attempts = 0; attempts < maxAttempts; attempts++) { // Loop for password attempts
            System.out.print("Enter your password: "); // Prompts user to enter password
            String userInput = passW.nextLine();  // Reads the user input

            if (userInput.equals(correctPassword)) { // Checks if the input matches the correct password
                System.out.println("Access granted."); 
                return;
            } else { // If the password is incorrect
                System.out.println("Incorrect password. Attempts left: " + (maxAttempts - attempts - 1)); // Informs the user of remaining attempts
            }
        }

        System.out.println("Access denied. You are locked out."); // Displays a message if the maximum attempts are exceeded
    }
}
