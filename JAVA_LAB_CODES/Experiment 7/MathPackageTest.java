import java.util.Scanner;

import arithmetic.ArithmeticOperations;
import statistical.StatisticalOperations;
import trigonometric.TrigonometricOperations;

public class MathPackageTest {

    public static void main(String[] args) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        StatisticalOperations statistical = new StatisticalOperations();
        TrigonometricOperations trigonometric = new TrigonometricOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation type: \n1. Arithmetic\n2. Statistical\n3. Trigonometric");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("Choose arithmetic operation: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
                int arithChoice = scanner.nextInt();
                switch (arithChoice) {
                    case 1:
                        System.out.println("Result: " + arithmetic.add(a, b));
                        break;
                    case 2:
                        System.out.println("Result: " + arithmetic.subtract(a, b));
                        break;
                    case 3:
                        System.out.println("Result: " + arithmetic.multiply(a, b));
                        break;
                    case 4:
                        System.out.println("Result: " + arithmetic.divide(a, b));
                        break;
                }
                break;

            case 2:
                System.out.println("Enter number of elements:");
                int n = scanner.nextInt();
                double[] nums = new double[n];
                System.out.println("Enter the numbers:");
                for (int i = 0; i < n; i++) {
                    nums[i] = scanner.nextDouble();
                }
                System.out.println(
                        "Choose statistical operation: \n1. Mean\n2. Median\n3. Variance\n4. Standard Deviation");
                int statChoice = scanner.nextInt();
                switch (statChoice) {
                    case 1:
                        System.out.println("Mean: " + statistical.mean(nums));
                        break;
                    case 2:
                        System.out.println("Median: " + statistical.median(nums));
                        break;
                    case 3:
                        System.out.println("Variance: " + statistical.variance(nums));
                        break;
                    case 4:
                        System.out.println("Standard Deviation: " + statistical.standardDeviation(nums));
                        break;
                }
                break;

            case 3:
                System.out.println("Enter the angle in degrees:");
                double angle = scanner.nextDouble();
                System.out.println("Choose trigonometric operation: \n1. Sin\n2. Cos\n3. Tan");
                int trigChoice = scanner.nextInt();
                switch (trigChoice) {
                    case 1:
                        System.out.println("Sin(" + angle + "): " + trigonometric.sin(angle));
                        break;
                    case 2:
                        System.out.println("Cos(" + angle + "): " + trigonometric.cos(angle));
                        break;
                    case 3:
                        System.out.println("Tan(" + angle + "): " + trigonometric.tan(angle));
                        break;
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
