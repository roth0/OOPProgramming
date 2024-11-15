package whileloopsum;

public class WhileLoopSum {

    public static void main(String[] args) {
        int count = 1;  
        int sum = 0;    // Variable to keep track of the sum
        
        System.out.println("Calculating the sum of numbers from 1 to 10");
        
        while (count <= 10) {
            sum += count;  // Add the current number to the sum
            count++;       // Increment the counter
        }
        
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
