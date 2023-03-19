import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public double getNumber1() {
        System.out.print("Enter first number: ");
        return scanner.nextDouble();
    }

    public double getNumber2() {
        System.out.print("Enter second number: ");
        return scanner.nextDouble();
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public String getOperation() {
        System.out.print("Enter operation (+, -, *, /): ");
        return scanner.next();
    }
}