/*10. Input any alphabet from a to f and print their city name accordingly (use switch) any other
alphabet should be invalid entry
 */

import java.util.Scanner;

public class PrintCityName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input alphabet to print city name: ");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet) {
            case 'A':

            case 'a':
                System.out.println("Afghanistan");
                break;

            case 'B':
            case 'b':
                System.out.println("Brazil");
                break;

            case 'C':
            case 'c':
                System.out.println("Canada");
                break;

            case 'D':
            case 'd':
                System.out.println("Denmark");
                break;

            case 'E':
            case 'e':
                System.out.println("Egypt");
                break;

            case 'F':
            case 'f':
                System.out.println("France");
                break;

            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
