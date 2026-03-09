import java.util.Scanner;

public class AdditionProgram {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Addition Program!");
        
        // Create a Scanner instance to accept user inputs
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Prompt for the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum
            int sum = addNumbers(num1, num2);

            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Method to add two integers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}