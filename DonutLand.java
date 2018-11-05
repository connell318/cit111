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
        // insantiating a new Donut
        // store a reference to this particular
        // Donut un a variable called firstDonut
        Donut firstDonut = new Donut();
        firstDonut.Taste = "Cinnamon";
        firstDonut.color = "Tan";
        firstDonut.topping = "None";
        System.out.println("FirstDonut's color:" 
                    + firstDonut.color);
        
        Donut secondDonut = new Donut();
        secondDonut.smell = "Cinnamon";
        secondDonut.name = "John";
        System.out.println("SecondDonut's name: "    
                + secondDonut.name);
        
        
        
    }//close main
    
}// close class
