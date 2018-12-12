/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ryan.connell
 */
public class HorseLand {
    public static void main(String[] args) {
 Scanner myScanner = new Scanner(System.in);
Horse firstHorse;
firstHorse = new Horse();
firstHorse.name = "Chestnut";
firstHorse.breed = "Thoroughbred";
firstHorse.color = "Grey";
firstHorse.height = "5.5ft";
firstHorse.weight = "1000 lbs";

 Horse secondHorse = new Horse();
secondHorse = new Horse();
secondHorse.name = "Apollo";
secondHorse.breed = "Friesian";
secondHorse.color = "Black";
secondHorse.height = "5.1ft";
secondHorse.weight = "1300 lbs";
 
Horse thirdHorse = new Horse();
thirdHorse = new Horse();
thirdHorse.name = "Lightning";
thirdHorse.breed = "Cleveland Bay";
thirdHorse.color = "brown and white";
thirdHorse.height = "5.3ft";
thirdHorse.weight = "1400 lbs";
    
    System.out.println("Hello! There are only three horses racing today!");
    //horse one
   
    System.out.println("********************");
    System.out.println("Name: " + firstHorse.name);
    System.out.println("Breed: " + firstHorse.breed);
    System.out.println("Color: " + firstHorse.color);
    System.out.println("Height: " + firstHorse.height);
    System.out.println("Weight: " + firstHorse.weight);
    System.out.println("********************");
 //horse two
   
    System.out.println("Name: " + secondHorse.name);
    System.out.println("Breed: " + secondHorse.breed);
    System.out.println("Color: " + secondHorse.color);
    System.out.println("Height: " + secondHorse.height);
    System.out.println("Weight: " + secondHorse.weight);
    System.out.println("********************");
    
    //horse three
    System.out.println("Name: " + thirdHorse.name);
    System.out.println("Breed: " + thirdHorse.breed);
    System.out.println("Color: " + thirdHorse.color);
    System.out.println("Height: " + thirdHorse.height);
    System.out.println("Weight: " + thirdHorse.weight);
    System.out.println("********************");
    
    System.out.println("What horse do you choose 1,2, or 3?");
    int place = 0;
        place = myScanner.nextInt();
        if (place == 1) {
            System.out.println("Okay, Chestnut it is!");
        } else {
            
    } //close method
         if (place == 2) {
            System.out.println("Okay, Apollo it is!");
        } else {
    } //close method
     if (place == 3) {
            System.out.println("Okay, Lightning it is!");
        } else {

    } //close method
              System.out.println("And the winner is ");
              System.out.println(firstHorse.winner());
    }//close main
    
}//close class