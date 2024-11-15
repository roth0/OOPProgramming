package evenandodd;  

public class EvenAndOdd {  
    
    public static void main(String[] args) {
        int jumlahEven = 0;  //  variable to hold the sum of even numbers
        int jumlahOdd = 0;  //  variable to hold the sum of odd numbers

        System.out.println("Even numbers between 1 and 10:");  
        for (int i = 1; i <= 10; i++) {  // Loops from 1 to 10
            if (i % 2 == 0) {  // Checks if the number is even
                System.out.print(i + " ");  // Prints the even number
                jumlahEven += i;  // Adds the even number to the sum of even numbers
            }
        }

        System.out.println("\nSum of even numbers: " + jumlahEven);  // Prints the sum of even numbers

        System.out.println("\nOdd numbers between 1 and 10:");  // Prints the header for odd numbers
        for (int i = 1; i <= 10; i++) {  // Loops from 1 to 10
            if (i % 2 != 0) {  // Checks if the number is odd
                System.out.print(i + " ");  // Prints the odd number
                jumlahOdd += i;  // Adds the odd number to the sum of odd numbers
            }
        }

        System.out.println("\nSum of odd numbers: " + jumlahOdd);  // Prints the sum of odd numbers
    }
}
