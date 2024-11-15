package unitconversion; // Defines the package name for this class

import java.util.Scanner; // Imports the Scanner class for reading input

public class Display { // Declares the public class Display

    public int showMainMenu(Scanner scanner) { // Method to display the main menu and return user's choice
        System.out.println("Unit Conversion Program"); // Displays the program title
        System.out.println("Choose a conversion:"); // Prompts user to choose a conversion type
        System.out.println("1. Temperature (Celsius - Fahrenheit)"); // Option for temperature conversion
        System.out.println("2. Distance (Kilometers - Miles)"); // Option for distance conversion
        System.out.println("3. Length (Meters - Feet)"); // Option for length conversion
        System.out.println("4. Memory (Gigabytes - Megabytes)"); // Option for memory conversion
        System.out.println("5. Weight (Kilograms - Pounds)"); // Option for weight conversion
        return scanner.nextInt(); // Reads and returns the user's choice
    }

    public int showTemperatureMenu(Scanner scanner) { // Method to display the temperature conversion menu and return user's choice
        System.out.println("Temperature Conversion:"); // Displays the temperature conversion menu title
        System.out.println("1. Celsius to Fahrenheit"); // Option to convert Celsius to Fahrenheit
        System.out.println("2. Fahrenheit to Celsius"); // Option to convert Fahrenheit to Celsius
        return scanner.nextInt(); // Reads and returns the user's choice
    }

    public int showDistanceMenu(Scanner scanner) { // Method to display the distance conversion menu and return user's choice
        System.out.println("Distance Conversion:"); // Displays the distance conversion menu title
        System.out.println("1. Kilometers to Miles"); // Option to convert kilometers to miles
        System.out.println("2. Miles to Kilometers"); // Option to convert miles to kilometers
        return scanner.nextInt(); // Reads and returns the user's choice
    }

    public int showLengthMenu(Scanner scanner) { // Method to display the length conversion menu and return user's choice
        System.out.println("Length Conversion:"); // Displays the length conversion menu title
        System.out.println("1. Meters to Feet"); // Option to convert meters to feet
        System.out.println("2. Feet to Meters"); // Option to convert feet to meters
        return scanner.nextInt(); // Reads and returns the user's choice
    }

    public int showMemoryMenu(Scanner scanner) { // Method to display the memory conversion menu and return user's choice
        System.out.println("Memory Conversion:"); // Displays the memory conversion menu title
        System.out.println("1. Gigabytes to Megabytes"); // Option to convert gigabytes to megabytes
        System.out.println("2. Megabytes to Gigabytes"); // Option to convert megabytes to gigabytes
        return scanner.nextInt(); // Reads and returns the user's choice
    }

    public int showWeightMenu(Scanner scanner) { // Method to display the weight conversion menu and return user's choice
        System.out.println("Weight Conversion:"); // Displays the weight conversion menu title
        System.out.println("1. Kilograms to Pounds"); // Option to convert kilograms to pounds
        System.out.println("2. Pounds to Kilograms"); // Option to convert pounds to kilograms
        return scanner.nextInt(); // Reads and returns the user's choice
    }

    public double getInput(String unit) { // Method to get input value from the user for a specified unit
        Scanner scanner = new Scanner(System.in); // Creates a new Scanner object to read input from the console
        System.out.print("Enter " + unit + ": "); // Prompts user to enter a value for the specified unit
        return scanner.nextDouble(); // Reads and returns the user's input as a double
    }

    public void showResult(String unit, double value) { // Method to display the result of a conversion
        System.out.println("Converted value: " + value + " " + unit); // Displays the converted value with the unit
    }
}
