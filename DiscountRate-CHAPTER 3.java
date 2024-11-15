package discountrate;

import java.util.Scanner; // Allow user to input

public class DiscountRate {
    public static void main(String[] args) { //main body 
        Scanner input = new Scanner(System.in);  // Create scanner object named input
         
        // Display the menu of discount rates 
        System.out.println("Available discount rates:");
        System.out.println("1. Red (5.0%)");
        System.out.println("2. Blue (10.0%)");
        System.out.println("3. Green (15.0%)");
        System.out.println("4. Yellow (20.0%)");
        
        // Input item details
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();
        
        //Input item price
        System.out.print("Enter item price: ");
        double price = input.nextDouble();
        
        //Input Item quantity
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        // Input discount rate choice
        System.out.print("Choose discount rate number (1-4): ");
        int choice = input.nextInt();
        
        // Initial discount rate
        double discountRate = 0.0;
        
        // Determine the discount rate based on the user's choice
        switch (choice) {
            case 1:discountRate = 5.0;
                break;
            case 2:discountRate = 10.0;
                break;
            case 3:discountRate = 15.0;
                break;
            case 4:discountRate = 20.0;
                break;
            default:discountRate = 0.0;
                System.out.println("Invalid choice. Using 0% discount.");
               
                break;
        }
        
        // Calculations
        double totalPrice = price * quantity;
        double discountAmount = (discountRate / 100) * totalPrice;
        double priceAfterDiscount = totalPrice - discountAmount;
        
        // Final Output
        System.out.println("\nPrice Calculation Summary:");
        System.out.println("Item name: " + itemName);
        System.out.println("Price per item: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price after Discount: RM" + priceAfterDiscount);
            }
}
