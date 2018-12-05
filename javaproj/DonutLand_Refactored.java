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
public class DonutLand_Refactored {
    //member variables
    private int percRemaining = 100;
    public String name;
    
    public void simulateEating (int percentEaten){
        System.out.println("Inside simulateEating method");
        percRemaining = percRemaining - percentEaten;
} //close method
    
    //method: takes no input parameters and returns percReamaining
    public int getPercRemaining(){
        System.out.println("Inside getPercRemaining method");
        return percRemaining;
    }//close method 
  private static void printObjectData(Donut d){

    }//close void
}//close class
