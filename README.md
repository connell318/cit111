# cit111
package ControlStructures;

import java.util.Scanner;

/**
 * Implements logic for checking friend compatability to practice if statements
 *
 * @author Ryan Connell
 */
public class MightWeBeFriends {

    public static void main(String[] args) {
        System.out.println("Welcome to friend picker!");
        // hard-coded response to question 1        
        int responseDogs = 1;
        // builds a scanner object and stores
        // in variable myScanner
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Do you like dogs? (0 = no, 1 = yes)");
        // read a line from the user and store in var
        responseDogs = myScanner.nextInt();
        

        int compScore = 0;
        int pointsPossible = 50;

        // TODO: Replace hard-code with user input
        // hard-coded response to question 1   
        if (responseDogs == 1) {
            compScore = compScore + 50;
            System.out.println("So do I!");
        } else {
            System.out.println("Why not?");
            compScore = compScore - 25;
        } // close inner if
    
    }// closes main method
}//close class
