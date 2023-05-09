import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        System.out.println("Welcome to the user!");

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Choose an operation (+, -, *, /): ");
            String operator = scanner.next();

            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another operation? (y/n): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("n")) {
                quit = true;
            }
        } while (!quit);

        System.out.println("Thank you for user!");
    }
}
