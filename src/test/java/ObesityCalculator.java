import java.util.Scanner;

public class ObesityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Input height in meters
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        scanner.close();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine obesity status
        String status;
        if (bmi < 18.5) {
            status = "underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "normal weight";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            status = "overweight";
        } else {
            status = "obese";
        }

        // Output BMI and obesity status
        System.out.println("BMI: " + bmi);
        System.out.println("Obesity status: " + status);
    }
}
