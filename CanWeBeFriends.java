# cit111
package canwebefriends;

import java.util.Scanner;

/**
 * Implements logic for checking friend compatability to practice if statements
 *
 * @author Ryan Connell
 */
public class CanWeBeFriends {

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
        int pointsPossible = 125;

        // TODO: Replace hard-code with user input
        // hard-coded response to question 1   
        if (responseDogs == 1) {
            compScore = compScore + 50;
            System.out.println("So do I!");
        } else {
            System.out.println("Why not?");
            compScore = compScore - 10;
            
        } // close inner if
                System.out.println("Do you like rap music? (0 = no, 1 = yes)");
            int responseRap = 1;
        // read a line from the user and store in var
        responseRap = myScanner.nextInt();
        
        // TODO: Replace hard-code with user input
        // hard-coded response to question 1   
        if (responseRap == 1) {
            compScore = compScore + 25;
            System.out.println("Me too!");
        } else {
            System.out.println(" :(");
            compScore = compScore - 10;
            
        }
                 System.out.println("Do you like rap music? (0 = no, 1 = yes)");
            int responseOffice = 1;
        // read a line from the user and store in var
        responseOffice = myScanner.nextInt();
        
        // TODO: Replace hard-code with user input
        // hard-coded response to question 1   
        if (responseOffice == 1) {
            compScore = compScore + 50;
            System.out.println("That's my favorite show!");
        } else {
            System.out.println("Aw ");
            compScore = compScore - 25;
            
        }
     // final check of compatibility score
        if(compScore > 75){
            System.out.println("Hey, we could be friends!");
        } else {
            System.out.println("Sorry, I don't think we would make good friends");
        } // end of if/else final
    }// closes main method
}//close class