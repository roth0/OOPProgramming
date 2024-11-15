package purchasingsystem;

import java.util.Scanner; // Allow user to input

public class PurchasingSystem {

    public static void main(String[] args) { //main body 
        Scanner input = new Scanner(System.in); // Create scanner object named input

        // Display available items
        System.out.println("Welcome to the Purchasing System");
        System.out.println("Available items:");
        System.out.println("1. Apple - RM1.00");//OPtion 1
        System.out.println("2. Banana - RM0.50");//OPtion 2
        System.out.println("3. Orange - RM0.75");//OPtion 3
        System.out.println("4. Exit");//Option 4

        // Get user input for item selection
        System.out.print("Please enter the number of the item you want to purchase: ");
        int itemNumber = input.nextInt(); //Input string types = nextInt , nextLine 


        // Declare variables
        double price = 0.0;
        String itemName = "";

        // Process the item selection
        if (itemNumber == 1) { //Condition 1
            itemName = "Apple";
            price = 1.00;
        } else if (itemNumber == 2) {//Condition 2
            itemName = "Banana";
            price = 0.50;
        } else if (itemNumber == 3) {//Condition 3
            itemName = "Orange";
            price = 0.75;
        } else if (itemNumber == 4) {//Condition 4
            System.out.println("Exiting the system. Thank you!");
            System.exit(0);
        } else {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        // Get quantity from user
        System.out.print("Enter the quantity for " + itemName + ": ");
        int quantity = input.nextInt();

        // Calculate total cost
        double totalCost = price * quantity;

        // Display the total cost
        System.out.println("You have selected " + quantity + " " + itemName + ".");
        System.out.printf("Total cost: RM%.2f\n", totalCost);

    }
}
