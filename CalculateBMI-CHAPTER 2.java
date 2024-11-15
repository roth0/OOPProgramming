package calculatebmi;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: User's weight and height
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in m): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display the BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("BMI Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("BMI Category: Overweight");
        } else {
            System.out.println("BMI Category: Obesity");
        }

        scanner.close();
    }
}
