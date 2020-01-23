
//7.WAP input any five number and then find average of five numbers


import java.util.Scanner;

public class AverageOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1st number:");
        double no1 = scanner.nextDouble();
        System.out.println("Please enter 2nd number:");
        double no2 = scanner.nextDouble();
        System.out.println("Please enter 3rd number:");
        double no3 = scanner.nextDouble();
        System.out.println("Please enter 4th number:");
        double no4 = scanner.nextDouble();
        System.out.println("Please enter 5th number:");
        double no5 = scanner.nextDouble();

        double average = (no1+no2+no3+no4+no5)/5;
        System.out.println("Average of five numbers "+no1+","+no2+","+no3+","+no4+", and "+no5+ " is ---> "+ average);

    }
}

