package dowhileloopsum;

public class DoWhileLoopSum {

    public static void main(String[] args) {
       
        int count = 1;       // Counter for the loop
        int sum = 0;         // Variable to store the sum
        
        System.out.println("Calculating the sum of numbers from 1 to 10");
        
        // Do-While Loop to calculate the sum
        do {
            sum += count;    // Add the current count to sum
            count++;         // Increment the count
        } while (count <= 10); // Continue until count is greater than 10
        
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
        
        // Reset sum and count for the next operation
        sum = 0;
        count = 1;

        System.out.println("Printing numbers from 1 to 10");
        
        // For Loop to print numbers from 1 to 10
        for (int count1 = 1; count1 <= 10; count1++) {
            System.out.println(count1);
        }
        
        // Reset count2 and sum for the next operation
        int count2 = 1;    
        sum = 0;
        System.out.println("Calculating the sum of numbers from 1 to 10");
        
        // While Loop to calculate the sum
        while (count2 <= 10) {
            sum += count2;  // Add the current number to the sum
            count2++;       // Increment the counter
        }
        
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
