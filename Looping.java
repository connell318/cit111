/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

import java.util.Scanner;

/**
 *
 * @author ryan.connell
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter your age to see if you can retire:");
        int age;
        Scanner inputScanner = new Scanner(System.in);
        //make a Scanner object and store in a variable whose name we can choose
        // the test condition for this while statement is always true,
        //so the looping will occur unitl the user issues a command to the compiler
        //to stop execution
        while (true) {
            // prompt the user for age
            //implemnt basic if() logic--if they're over 65.5
        age = inputScanner.nextInt();
            if (age > 65.5) {
                //if true
                System.out.println("Wahoo! Grab the newspaper and martini!");
                //closes if > 65.5
            } else if (age < 0) {
                System.out.println("Thanks for checking your retirement stauts");
                break;
            } else {
                // if false
                System.out.println("Sorry, Keep working...");
            } // close if/else block

        } // close while () loop
    }//close main method
}// close class
