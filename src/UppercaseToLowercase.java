//12.Input any alphabet in uppercase and print it in lowercase


import java.util.Scanner;

public class UppercaseToLowercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any uppercase character(A To Z):");
        char uppercase = scanner.next().charAt(0);
        char lowercase = Character.toLowerCase(uppercase);
        System.out.println("Lowercase of alphabet "+uppercase+" is : "+lowercase);

    }

}
