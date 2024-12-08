import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Display a user prompt to make a choice
        System.out.println("make a choice");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Concert Celsius to Fahrenheit");
        // Read users Choice
        System.out.println("Enter your choice (1 or 2):");
        int choice = scanner.nextInt();
        // Declaring the variables to be used in the calculation
        double celsius;
        double fahrenheit;
        if (choice== 1) {// converting from Fahrenheit to Celsius
            System.out.println("Enter temperature value in Fahrenheit");
             fahrenheit = scanner.nextDouble();
             celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in celsius is " + celsius);
        }
            else if (choice==2) {
            // Converting from Celsius to Fahrenheit
            System.out.println("enter the temperature value in celsius");
            celsius = scanner.nextDouble();
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        }
            else
            System.out.println("Please enter a valid number (1 or 2)");
         // Close the scanner
        scanner.close();

        }
    }
