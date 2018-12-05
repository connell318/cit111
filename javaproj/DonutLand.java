/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproj;

/**
 *
 * @author ryan.connell
 */
public class DonutLand {
    public static void main(String[] args) {
        final int firstBiteSize = 12;
        final int secondBiteSize = 50;
        // create a "handle" variable that can store references to Donut objects
        Donut firstDonut;
        // create a new Donut (an instance of the Donut Class) and connect
        // this new object to our "handle variable firstDonut
        firstDonut = new Donut();
        
        //access firstDonut's name property, wich is type String, and 
        // store the name "Chloe";
        firstDonut.name = "Chloe";
                
        // print a test of Chloe's member variable values
        System.out.println("When first created, " + firstDonut.name + "'s/n"
                + "percent remaining is " + firstDonut.getPercRemaining());
        // convinence method for printing a row of dots to the screen 
        printDivider();
        
        System.out.println("Calling simulateEating and passing in/n" + 
                "a bite size of " + firstBiteSize);
        printDivider();
             // insantiating a new Donut
        // store a reference to this particular
        // Donut un a variable called firstDonut
        firstDonut.Taste = "Cinnamon";
        firstDonut.color = "Tan";
        firstDonut.topping = "None";
        System.out.println("FirstDonut's color:" 
                    + firstDonut.color);
        //call a method simulateEating on our firstDonut object and pass
        // in the int variable firstBiteSize as a parameter
        firstDonut.simulateEating(firstBiteSize);
        System.out.println("After being eaten, " + firstDonut.name + "'s/n"
                + "percent remaining " + firstDonut.getPercRemaining());
        
        //second Donut
        Donut secondDonut = new Donut();
        secondDonut.smell = "Cinnamon";
        secondDonut.name = "John";
        secondDonut.simulateEating(secondBiteSize);
        System.out.println("After being eaten, " + secondDonut.name + "'s/n"
                + "percent remaining " + firstDonut.getPercRemaining());
    }//close main
    
    private static void printDivider(){
        System.out.println(".......................................");
    }
}// close class
