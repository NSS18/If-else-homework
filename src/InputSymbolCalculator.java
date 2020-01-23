/*
13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
subtraction, multiplication and division according to their symbol - using switch
 */

import java.util.Scanner;

public class InputSymbolCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Number 1:");
        double no1 = scanner.nextDouble();
        System.out.println("Please enter Number 2:");
        double no2 = scanner.nextDouble();
        System.out.println("Please enter any symbol from +.-.* or /");
        String symbol = scanner.next();
        double value;

        switch (symbol) {
            case "+":
                value = no1 + no2;
                System.out.println("Addition of " + no1 + " and " + no2 + " is: " + value);
                break;

            case "-":
                value = no1 - no2;
                System.out.println("Subtraction of " + no1 + " and " + no2 + " is: " + value);
                break;

            case "*":
                value = no1 * no2;
                System.out.println("Multiplication of " + no1 + " and " + no2 + " is: " + value);
                break;

            case "/":
                value = no1 / no2;
                System.out.println("Division of " + no1 + " and " + no2 + " is: " + value);
                break;


            default:
                System.out.println("Symbol " + symbol + " is invalid.");
                break;
        }
    }
}
