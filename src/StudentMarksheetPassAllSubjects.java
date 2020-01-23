/*
4. WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
he is pass or fail on basis of percentage (pass>=35) and also give them grade
>= 80 A+
>= 60 A
>= 50 B
>= 35 C
same as above but pass or fails on the basis of..student needs to pass all the subjects
 */


import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentMarksheetPassAllSubjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student name: ");
        String studentname = scanner.nextLine();

        System.out.println("Please enter student roll number: ");
        int rollnumber = scanner.nextInt();

        System.out.println("Please enter marks (out of 100) for subject Maths:");
        float maths = scanner.nextFloat();
        System.out.println("Please enter marks (out of 100) for subject Science:");
        float science = scanner.nextFloat();
        System.out.println("Please enter marks (out of 100) for subject English:");
        float english = scanner.nextFloat();

        float total = maths + science + english;
        System.out.println("Total for three subjects Maths("+maths+") English("+english+") and Science("+science+") is : "+total);

        double percentage = (total*100)/300;
        System.out.println(studentname+" scored "+percentage+"% in the exam.");
        System.out.println(studentname+"'s Marksheet:");

        if(maths>=35 && science>=35 && english>=35  && percentage>=80)
        {
            String grade = "A+ Grade.";

            System.out.println(studentname+" PASSED in the exam with "+ grade );
            System.out.println("Maths:"+maths);
            System.out.println("Science:"+science);
            System.out.println("English:"+english);
            System.out.println("Percentage:"+percentage);



        }

        else if ( maths>=35 && science>=35 && english>=35 && percentage>=60)
        {
            String grade = "A Grade.";
            System.out.println(studentname+" PASSED in the exam with "+ grade );
            System.out.println("Maths:"+maths);
            System.out.println("Science:"+science);
            System.out.println("English:"+english);
            System.out.println("Percentage:"+percentage);
        }

        else if ( maths>=35 && science>=35 && english>=35 && percentage>=50)
        {
            String grade = "B grade.";
            System.out.println(studentname+" PASSED in the exam with "+ grade);
            System.out.println("Maths:"+maths);
            System.out.println("Science:"+science);
            System.out.println("English:"+english);
            System.out.println("Percentage:"+percentage);
        }

        else if ( maths>=35 && science>=35 && english>=35 && percentage>=35)
        {
            String grade = "C Grade.";
            System.out.println(studentname+" PASSED in the exam with "+ grade);
            System.out.println("Maths:"+maths);
            System.out.println("Science:"+science);
            System.out.println("English:"+english);
            System.out.println("Percentage:"+percentage);
        }
        else {
            System.out.println(studentname + " FAILED the exam");
            System.out.println("Maths:" + maths);
            System.out.println("Science:" + science);
            System.out.println("English:" + english);

        }





    }
}
