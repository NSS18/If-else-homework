
import java.util.Scanner;

/*11.Write Java program to allow the user to input his/her age. Then the program will show if the
        person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
        old.
*/
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age:");
        float age = scanner.nextFloat();

        if(age>=18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("you are not eligible to vote.");
    }

}
