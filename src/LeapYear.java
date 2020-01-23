

//2. WAP to input any year like 1989 and find out if it is leap year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year:");
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400== 0)) {
            System.out.println(year + " is the leap year");
        } else
            System.out.println(year + " is not the leap year");

    }
}
