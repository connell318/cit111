/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kennywoodridetracker;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ryan.connell
 */
public class KennywoodRideTracker {
    //final ints for the minimum height a rider 
    //must be for thrill and theme rides
    //ints
        static int totalRiders = 0;
        static int failedRideAttempts = 0;
        static int sickRiders = 0;
        
        //final ints
        final static int MINHEIGHT_THRILL = 60;
        final static int MINHEIGHT_THEME = 48;

    //main
    public static void main(String[] args) {
        
        
        System.out.println("Riding Black Widow...");
        //get the number of riders from the user
        System.out.println("Enter the number of riders ;");
            Scanner ScanRiders = new Scanner(System.in);
            int groupAmount = ScanRiders.nextInt();
            
        //do the riders meet the height requirement    
        System.out.println("Enter the height of the riders :");
            Scanner ScanHeight = new Scanner(System.in);
            int height = ScanHeight.nextInt();
        
        //formatting
        System.out.println(" ");
        
        
        //get calculations
        rideBlackWidow(groupAmount, height);
        
        //print stats
        printRideStats();
        
        
        rideMerryGoRound(groupAmount, height);
        
        
        //print ride stats
        printRideStats();
            
    }//close main

        public static int rideBlackWidow(int groupSize, int height) {
            
            
            if (height >= MINHEIGHT_THRILL) {
            System.out.println("Riding Black Widow...");
            totalRiders = totalRiders + groupSize;
            Random rand = new Random();
            sickRiders = rand.nextInt(groupSize);
            
            } else { 
                System.out.println("Riders turned away!! Too short!!");
                failedRideAttempts = failedRideAttempts + groupSize;
            }
            return totalRiders;
            }//end rideBlackWidow
        
        
        
            public static int rideMerryGoRound(int groupSize, int height) {
                if (height >= MINHEIGHT_THEME) {
                System.out.println("Riding MerryGoRound...");
                totalRiders = totalRiders + groupSize;
                Random rand = new Random();
                sickRiders = rand.nextInt(groupSize);
            
                } else { 
                    System.out.println("Riders turned away. Too short to ride.");
                    failedRideAttempts = failedRideAttempts + groupSize;
                }
                return totalRiders;
            }//end rideMerryGoRound
        
        
        
            public static void printRideStats() {
                System.out.println(" ");
                System.out.println("*******RIDER STATS*******");
                System.out.println("Total Riders: " + totalRiders);
                System.out.println("Total Failed Ride Attempts: " + failedRideAttempts);
                System.out.println("Total Sick Riders: " + sickRiders);
                System.out.println("*************************");
                System.out.println(" ");
            }//end printRideStats

   
    
    
    
}//close class
