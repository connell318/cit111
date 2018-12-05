
package javaproj;

/**
 *class to test our Car
 * ''blueprint" class
 * @author ryan.connell
 */
public class CarLand {
//no mem vars
    public static void main(String[] args) {
        // TODO code application logic here
        Car deLorean = new Car();
        //set member variables on the instance of car stored
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        //send our car instance to a helper method to print
        displayCarStats(deLorean);
        // test its methods
        deLorean.startEngine();
        deLorean.accelerate(88);
        deLorean.accelerate(12);
        //check status again
        displayCarStats(deLorean);
        deLorean.stopEngine();
        displayCarStats(deLorean);
        deLorean.isEngineOn = true;
        
    }//close main
    public static void displayCarStats(Car anyCarObject){
        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.year +  " " + anyCarObject.makeModel);
        System.out.println("Enginge running? " + anyCarObject.checkEngineStatus());
        System.out.println("CurrentSpeed " + anyCarObject.getCurrentSpeed());
        System.out.println("****************");
    }//close displayCarStats
}//close class
