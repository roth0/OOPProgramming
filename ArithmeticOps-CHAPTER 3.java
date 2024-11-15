package arithmeticops;

import java.util.Scanner; // Allow user to input

public class ArithmeticOps {

    public static void main(String[] args) { //main body 
        Scanner input = new Scanner(System.in);  // Create scanner object named input

        // Display the menu
        System.out.println("Choose an arithmetic operation:");
        System.out.println("1. Addition"); //Choice 1 
        System.out.println("2. Subtraction"); // Choice
        System.out.println("3. Multiplication"); //Choice 3
        System.out.println("4. Division"); //Choice 4

        // Get user choice
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = input.nextInt(); // Input string types = nextInt , nextLine 


        // Get input numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble(); //Input string types = nextInt , nextLine 

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble(); //Input string types = nextInt , nextLine 


        double result; //Variable declaration

        // Perform the operation based on user choice
        switch (choice) {
            
            //case 1 is Addition 
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);//calculation
                break;
                
            //case 2 is Subtraction     
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);//calculation
                break;
                
            //case 3 is Multiply
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);//calculation
                break;
                
            //case 4 is Divide
            case 4:
                // Check if the denominator is not zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);//calculation
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            //Default case    
            default:
                System.out.println("Invalid choice.");
                break;
        }

    }
}
