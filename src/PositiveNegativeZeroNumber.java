//8. WAP to input any number and fid our if it is positive , negative or zero


import java.util.Scanner;

public class PositiveNegativeZeroNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:");
        int no = scanner.nextInt();
        if(no>0)
            System.out.println("Number "+no+" is positive number.");
        else if(no<0)
            System.out.println("Number "+no+" is negative number.");
        else
            System.out.println("Number "+no+" is zero number.");
    }
}
