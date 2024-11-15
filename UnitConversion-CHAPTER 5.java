package unitconversion; // Defines the package name for this class

import java.util.Scanner; // Imports the Scanner class for reading input

public class UnitConversion { // Declares the public class UnitConversion

    public static void main(String[] args) { // Main method where program execution starts
        Scanner read = new Scanner(System.in); // Creates a Scanner object to read input from the console
        Display display = new Display(); // Creates an instance of the Display class for showing menus and results
        Formula formula = new Formula(); // Creates an instance of the Formula class for performing conversions

        int choice = display.showMainMenu(read); // Displays the main menu and gets the user's choice

        switch (choice) { // Switch statement to handle the user's choice
            case 1: // Temperature conversions
                int tempChoice = display.showTemperatureMenu(read); // Displays the temperature menu and gets the user's choice
                if (tempChoice == 1) { // Celsius to Fahrenheit
                    double celsius = display.getInput("Celsius"); // Gets Celsius temperature input from the user
                    display.showResult("Fahrenheit", formula.celsiusToFahrenheit(celsius)); // Converts and displays the result in Fahrenheit
                } else { // Fahrenheit to Celsius
                    double fahrenheit = display.getInput("Fahrenheit"); // Gets Fahrenheit temperature input from the user
                    display.showResult("Celsius", formula.fahrenheitToCelsius(fahrenheit)); // Converts and displays the result in Celsius
                }
                break;

            case 2: // Distance conversions
                int distanceChoice = display.showDistanceMenu(read); // Displays the distance menu and gets the user's choice
                if (distanceChoice == 1) { // Kilometers to Miles
                    double kilometers = display.getInput("Kilometers"); // Gets kilometers input from the user
                    display.showResult("Miles", formula.kilometersToMiles(kilometers)); // Converts and displays the result in Miles
                } else { // Miles to Kilometers
                    double miles = display.getInput("Miles"); // Gets miles input from the user
                    display.showResult("Kilometers", formula.milesToKilometers(miles)); // Converts and displays the result in Kilometers
                }
                break;

            case 3: // Length conversions
                int lengthChoice = display.showLengthMenu(read); // Displays the length menu and gets the user's choice
                if (lengthChoice == 1) { // Meters to Feet
                    double meters = display.getInput("Meters"); // Gets meters input from the user
                    display.showResult("Feet", formula.metersToFeet(meters)); // Converts and displays the result in Feet
                } else { // Feet to Meters
                    double feet = display.getInput("Feet"); // Gets feet input from the user
                    display.showResult("Meters", formula.feetToMeters(feet)); // Converts and displays the result in Meters
                }
                break;

            case 4: // Memory conversions
                int memoryChoice = display.showMemoryMenu(read); // Displays the memory menu and gets the user's choice
                if (memoryChoice == 1) { // Gigabytes to Megabytes
                    double gigabytes = display.getInput("Gigabytes"); // Gets gigabytes input from the user
                    display.showResult("Megabytes", formula.gigabytesToMegabytes(gigabytes)); // Converts and displays the result in Megabytes
                } else { // Megabytes to Gigabytes
                    double megabytes = display.getInput("Megabytes"); // Gets megabytes input from the user
                    display.showResult("Gigabytes", formula.megabytesToGigabytes(megabytes)); // Converts and displays the result in Gigabytes
                }
                break;

            case 5: // Weight conversions
                int weightChoice = display.showWeightMenu(read); // Displays the weight menu and gets the user's choice
                if (weightChoice == 1) { // Kilograms to Pounds
                    double kilograms = display.getInput("Kilograms"); // Gets kilograms input from the user
                    display.showResult("Pounds", formula.kilogramsToPounds(kilograms)); // Converts and displays the result in Pounds
                } else { // Pounds to Kilograms
                    double pounds = display.getInput("Pounds"); // Gets pounds input from the user
                    display.showResult("Kilograms", formula.poundsToKilograms(pounds)); // Converts and displays the result in Kilograms
                }
                break;

            default: // Handles invalid choices
                System.out.println("Invalid choice. Please restart the program."); // Displays an error message for invalid choices
        }
    }
}
