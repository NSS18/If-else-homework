//1. Input any two number and find out its odd or even use turnery operator

import java.util.Scanner;

public class TurneryOddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        String oddeven=(number%2==0)?" is even":" is odd";
        System.out.println(number+oddeven);


    }
}

