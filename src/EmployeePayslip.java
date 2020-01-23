/*6.WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA -PF
*/


import java.util.Scanner;

public class EmployeePayslip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Employee name:");
        String employeename=scanner.nextLine();

        System.out.println("Please enter Employee ID:");
        int employeeid=scanner.nextInt();

        System.out.println("Please enter basic salary:");
        double basicsalary=scanner.nextDouble();

        double hra= basicsalary*0.10;
        System.out.println(employeename+"'s HRA is: "+hra);
        double da = basicsalary*0.08;
        System.out.println(employeename+"'s DA is: "+da);
        double ta = basicsalary*0.09;
        System.out.println(employeename+"'s TA is: "+ta);
        double pf= basicsalary*0.20;
        System.out.println(employeename+"'s PF is: "+pf);
        double grosssalary = basicsalary+hra+ta+da-pf;
        System.out.println(employeename+"'s Gross Salary is: "+grosssalary);








    }
}
