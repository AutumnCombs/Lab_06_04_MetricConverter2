import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a measurement in meters: ");
        if (scanner.hasNextDouble()) {
            double meters = scanner.nextDouble();
            scanner.close();

            if (meters >= 0) {
                // Conversion factors meters to x
                double meToMi = 0.000621371;
                double meToFt = 3.28084;
                double meToIn = 39.3701;

                // Conversions of meters to x
                double miles = meters * meToMi;
                double feet = meters * meToFt;
                double inches = meters * meToIn;

                // Display the results
                System.out.println("Conversion results:");
                System.out.println("Miles: " + miles);
                System.out.println("Feet: " + feet);
                System.out.println("Inches: " + inches);
            } else {
                System.err.println("Error: Please enter a non-negative measurement.");
            }
        } else {
            System.err.println("Error: Invalid input. Please enter a valid number.");
        }
    }
}