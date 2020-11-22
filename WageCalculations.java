
package wagecalculations;
import java.util.Scanner;

public class WageCalculations {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter how many hours they worked: ");
        double hours = input.nextDouble();
        System.out.println("Enter what their hourly wage is: ");
        double wage = input.nextDouble();
        
        System.out.println();
        
        double bpay = 0; 
        double pay15  = 0; 
        double pay20 = 0;
        
        
        
        if (hours <= 40) {
            bpay = hours * wage;
            System.out.println("Their basic pay: $" + (int) bpay);
        } else if (hours > 40 && hours <= 50) {
            bpay = 40 * wage;
            System.out.println("Their basic pay: $" + (int) bpay);
            pay15 = (hours - 40) * (wage * 1.5);
            System.out.println("Their time and a half pay: $" + (int) pay15);
        } else {
            bpay = 40 * wage;
            System.out.println("Their basic pay: $" + (int) bpay);
            pay15 = 10 * (wage * 1.5);
            System.out.println("Their time and a half pay: $" + (int) pay15);
            pay20 = (hours - 50) * (wage * 2.0);
            System.out.println("Their double pay: $" + (int) pay20);
        }       
        
        
        
        
        double grossPay = bpay + pay15 + pay20;
        System.out.println("Their gross pay: $" + (int) grossPay);
        
        System.out.println();
        
        double paye = grossPay * .2;
        System.out.println("Their PAYE deductions: $" + (int) paye);
        double prsi = grossPay * .05;
        System.out.println("Their PRSI deductions: $" + (int) prsi);
        double usc = grossPay * .02;
        System.out.println("Their USC deductions: $" + (int) usc);
        
        System.out.println();
        
        double totDeductions = paye + prsi + usc;
        System.out.println("Their total deductions: $" + (int) totDeductions);
        double netPay = grossPay - totDeductions;
        System.out.println("Their net pay: $" + (int) netPay);
        
    }
    
}
// Get Scanner
// Get in hours worked and hourly wage

// If they work 40hr < 1.5x <= 50 
// If they work 50hr < 2.0x 

// Output basic pay
// Output 1.5x pay
// Output 2.0x pay 
// Output gross pay
// Output paye, prsi and usc deductions
// Output total deductions
// Output net pay