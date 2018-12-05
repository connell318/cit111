/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproj;

/**
 *"blueprint class for
 * modeling a real life
 * donut in Java
 * @author ryan.connell
 */
public class Donut {
     //there's mo main() method in this class! 
    // we must make this object with the new keyword inside another class
    // in order for this calss to do anything
    //  member variables
    // that all Donut objects have

String Taste;
String topping;
String color;  
String smell;

      //member variables
    private int percRemaining = 100;
    public String name;
    
    //method: takes in an integer representing the size of bite
    // being taken of this donut. returns nothing
    public void simulateEating(int percentEaten){
      //subtract the bite size from the existing donut percent remaining 
      percRemaining = percRemaining - percentEaten;
    } //close method

    public int getPercRemaining(){
        return percRemaining;
    }

}//close calss
