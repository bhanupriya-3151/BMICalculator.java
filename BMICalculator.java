import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple BMI Calculator ===");

        // Input weight in kg
        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();

        // Input height in meters
        System.out.print("Enter your height (meters): ");
        double height = sc.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Status and advice
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
            System.out.println("Advice: Consider a balanced diet to gain healthy weight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Status: Normal weight");
            System.out.println("Advice: Maintain your current lifestyle for good health.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Status: Overweight");
            System.out.println("Advice: Include regular exercise and a healthy diet to reduce weight.");
        } else {
            System.out.println("Status: Obese");
            System.out.println("Advice: Consult a healthcare professional for a proper weight-loss plan.");
        }

        sc.close();
    }
}
//end of the bmi calculation
