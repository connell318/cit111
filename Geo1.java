/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit111;

import java.util.Scanner;

public class Geo1 {

/**
 *
 * @author ryan.connell
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
        //input scanner
        System.out.println("Enter the radius and height of the cylinder to calculate its volume");
        System.out.println("Cylinder radius: ");
        double cylinderRadius = myScanner.nextDouble();
        //enter the radius of cylinder
        System.out.println("Cylinder hieght: ");
        double cylinderHeight = myScanner.nextDouble();
        //enter height of cylinder
        System.out.println("The volume of the cylinder is: "+calcVolumnOfCylinder(cylinderRadius,cylinderHeight));
    }//close main
      
    public static double calcVolumnOfCylinder(double radius,double height){
        final double PI=3.1416;
        double cylinderVolume = PI*(radius*radius)*height;
        //return the area back to the calling method
        return cylinderVolume;
    }//close cylinder method
}// close class

