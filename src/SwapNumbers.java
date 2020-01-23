//5. WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Number1:");
        double number1=scanner.nextDouble();

        System.out.println("Please enter Number2:");
        double number2=scanner.nextDouble();
        System.out.println("Before Swapping numbers:");
        System.out.println("Number 1: "+number1);
        System.out.println("Number 2: "+number2);
        double temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swapping new Number1 is: "+number1);
        System.out.println("After swapping new Number2 is: "+number2);



    }
}

