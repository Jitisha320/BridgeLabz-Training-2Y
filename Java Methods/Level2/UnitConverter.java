import java.util.Scanner;

public class UnitConverter {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Temperature in Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        // Weight Conversion
        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Weight in Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in Kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("Weight in Pounds: " + convertKilogramsToPounds(kilograms));
        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Volume in Liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter volume in Liters: ");
        double liters = sc.nextDouble();
        System.out.println("Volume in Gallons: " + convertLitersToGallons(liters));

        sc.close();
    }
}