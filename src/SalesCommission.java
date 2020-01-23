
/*9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales
commission
sales amount >= 50,000 35%
sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */


import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter seller's name:");
        String sallersname = scanner.nextLine();
        System.out.println("Please enter sales ID:");
        int salesid = scanner.nextInt();

        System.out.println("Please enter sales amount:");
        double salesamount=scanner.nextDouble();
        System.out.println("Please enter salary basic:");
        double salarybasic = scanner.nextDouble();
        if (salesamount>=50000)
        {
            double salescommission =salesamount*0.35;
            System.out.println("Sales commission is:"+salescommission);
        }
        else if (salesamount>=30000)
        {
            double salescommission =salesamount*0.20;
            System.out.println("Sales commission is:"+salescommission);
        }
        else if (salesamount>=20000)
        {
            double salescommission =salesamount*0.10;
            System.out.println("Sales commission is:"+salescommission);
        }

        else if (salesamount>=10000)
        {
            double salescommission =salesamount*0.05;
            System.out.println("Sales commission is:"+salescommission);
        }
        else
        {
            double salescommission =salesamount*0.02;
            System.out.println("Sales commission is:"+salescommission);
        }




    }
}
