package maximumandminimum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char repeat;

        do {
            int num1 = getInput("Enter the first number: ");
            int num2 = getInput("Enter the second number: ");
            int num3 = getInput("Enter the third number: ");

            // Find the maximum and minimum values
            int maxVal = findMax(num1, num2, num3);
            int minVal = findMin(num1, num2, num3);

            // Display the maximum and minimum values
            System.out.println("The maximum value is: " + maxVal);
            System.out.println("The minimum value is: " + minVal);

            System.out.print("\nDo you want to repeat? (y/n): ");
            repeat = read.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Thank you for using the program!");
        read.close();
    }

    // Method to get a valid integer input from the user
    private static int getInput(String prompt) {
        Scanner read = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(prompt);
                number = read.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                read.next(); // Clear the invalid input
            }
        }
        return number;
    }

    // Method to find the maximum value among three numbers
    private static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    // Method to find the minimum value among three numbers
    private static int findMin(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
}
