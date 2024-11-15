package userinfo;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Consume the leftover newline
        scanner.nextLine(); 

        // Ask the user to enter their hobby
        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        // Ask the user to enter their favorite food
        System.out.print("Enter your favorite food: ");
        String favoriteFood = scanner.nextLine();

        // Display the user's input
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);

        // Close the scanner
        scanner.close();
    }
}
