
/*16.Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel or Consonant, depending on the user input.
        For eg:
        Input an alphabet: p
        Expected Output :
        Input letter is Consonant
*/

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input any character(a-z or A-Z) ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet=='a' || alphabet=='e'|| alphabet=='i'||alphabet=='o'||alphabet=='u'||alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
            System.out.println("Given character "+alphabet+" is Vowel.");
        else if((alphabet>='a'&&alphabet<='z')||(alphabet>='A'&&alphabet<='Z'))
            System.out.println("Given character "+alphabet+" is consonant.");
        else
            System.out.println("Given number is not an alphabet. ");


    }
}
