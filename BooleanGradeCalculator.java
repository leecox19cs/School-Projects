package booleangradecalculator;
import java.util.Scanner;
//@author lcox1906

public class BooleanGradeCalculator {

    public static void main(String[] args) {
        //delace scanner and variables
        Scanner input = new Scanner(System.in);
        int mark;
        char answer = '0';
        
        //loop runs the same again if invalid mark is entered instead of ending
        for (int x = 0; x < 1; x++) {
            mark = input.nextInt();
            if (mark >= 0 && mark < 40) { //Checks if mark is in 'U' range....
                answer = 'U';
            }
            if (mark >= 40 && mark < 55) {
                answer = 'D';
            }
            if (mark >= 55 && mark < 70) {
                answer = 'C';
            }
            if (mark >= 70 && mark < 85) {
                answer = 'B';
            }
            if (mark >= 85 && mark <= 100) {
                answer = 'A';
            }
            if(answer == '0') {
                System.out.println("Please enter a valid mark");
                 x = -1; // Sets x to -1 so the program will run again
            }
        }
        
        //Prints the answer duh 
        System.out.println("Grade: " + answer);
    }
}