
package loopimperial_metric_conversions;
import java.util.Scanner;

//@author lcox1906 

public class LoopImperial_Metric_Conversions {

    
    public static void main(String[] args) {
        
        //Variables, Scanner and warning
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("!!!Entering an option not in the menus will restart the program!!!");
        
        //While loop to rerun the program when not exited
        while(true) {
            
        //Choose menu for Metric to Imperial or Imperial to Metric
        System.out.println("\nPick an option by entering the number\nOption 1: Imperial to Metric\nOption 2: Metric to Imperial\n");
        int menu1option = input.nextInt();
        
        //Menu 2 options and calculations
        if (menu1option == 1) {
            //Checks which option for conversion type you picked and then asks you to pick an option in this menu and calculates and outputs
            //Menu three is the same with different calculations
            System.out.println("\nPick an option by entering the number\nOption 1: Miles to Kilometers\nOption 2: Pounds to Kilograms\nOption 3: Gallons to Litres\nOption 4: Exit\n");
            int menu2option = input.nextInt();
            
            if (menu2option == 1) {
                System.out.println("\nEnter Miles: ");
                num1 = input.nextDouble();
                num2 = num1 * 1.609344;
                System.out.println("Answer in Kilometers: " + num2);
            }
            if (menu2option == 2) {
                System.out.println("\nEnter Pounds: ");
                num1 = input.nextDouble();
                num2 = num1 * 0.45359237;
                System.out.println("Answer in Kilograms: " + num2);
            }
            if (menu2option == 3) {
                System.out.println("\nEnter Gallons: ");
                num1 = input.nextDouble();
                num2 = num1 * 3.785411784;
                System.out.println("Answer in Litres: " + num2);
            }
            if (menu2option == 4) {
                break;
            }
            
            
        }
        
        //Menu 3 options and calculations
        if (menu1option == 2) {
             System.out.println("\nPick an option by entering the number\nOption 1: Kilometers to Miles\nOption 2: Kilograms to Pounds\nOption 3: Litres to Gallons\nOption 4: Exit\n");
            int menu2option = input.nextInt();
            
            if (menu2option == 1) {
                System.out.println("\nEnter Kilometers: ");
                num1 = input.nextDouble();
                num2 = num1 * 0.62137119;
                System.out.println("Answer in Miles: " + num2);
            }
            if (menu2option == 2) {
                System.out.println("\nEnter Kilograms: ");
                num1 = input.nextDouble();
                num2 = num1 * 2.2046226218488;
                System.out.println("Answer in Pounds: " + num2);
            }
            if (menu2option == 3) {
                System.out.println("\nEnter Litres: ");
                num1 = input.nextDouble();
                num2 = num1 * 4.54609;
                System.out.println("Answer in Gallons: " + num2);
            }
            if (menu2option == 4) {
                break;
            }   
        }
        }
    }
}
