
//14. Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class FindNumberAlphabetSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 1 digit value as a number,alphabet or symbol");
        char value= scanner.next().charAt(0);

        if(value>='0'&& value<='9')
        {
            System.out.println("Value is number");
        }
        else if((value>='a' && value<='z') ||(value>='A' && value<='Z'))
        {
            System.out.println("Value is alphabet");
        }
        else
            System.out.println("Value is symbol");


    }
}
