package unitconversion; // Defines the package name for this class

public class Formula { // Declares the public class Formula

    // Temperature Conversion
    public double celsiusToFahrenheit(double celsius) { // Method to convert Celsius to Fahrenheit
        return (celsius * 9/5) + 32; // Uses the formula (Celsius * 9/5) + 32 to convert to Fahrenheit
    }

    public double fahrenheitToCelsius(double fahrenheit) { // Method to convert Fahrenheit to Celsius
        return (fahrenheit - 32) * 5/9; // Uses the formula (Fahrenheit - 32) * 5/9 to convert to Celsius
    }

    // Distance Conversion
    public double kilometersToMiles(double kilometers) { // Method to convert kilometers to miles
        return kilometers * 0.621371; // Multiplies kilometers by the conversion factor 0.621371 to get miles
    }

    public double milesToKilometers(double miles) { // Method to convert miles to kilometers
        return miles / 0.621371; // Divides miles by the conversion factor 0.621371 to get kilometers
    }

    // Length Conversion
    public double metersToFeet(double meters) { // Method to convert meters to feet
        return meters * 3.28084; // Multiplies meters by the conversion factor 3.28084 to get feet
    }

    public double feetToMeters(double feet) { // Method to convert feet to meters
        return feet / 3.28084; // Divides feet by the conversion factor 3.28084 to get meters
    }

    // Memory Conversion
    public double gigabytesToMegabytes(double gigabytes) { // Method to convert gigabytes to megabytes
        return gigabytes * 1024; // Multiplies gigabytes by 1024 to get megabytes
    }

    public double megabytesToGigabytes(double megabytes) { // Method to convert megabytes to gigabytes
        return megabytes / 1024; // Divides megabytes by 1024 to get gigabytes
    }

    // Weight Conversion
    public double kilogramsToPounds(double kilograms) { // Method to convert kilograms to pounds
        return kilograms * 2.20462; // Multiplies kilograms by the conversion factor 2.20462 to get pounds
    }

    public double poundsToKilograms(double pounds) { // Method to convert pounds to kilograms
        return pounds / 2.20462; // Divides pounds by the conversion factor 2.20462 to get kilograms
    }
}
