
package javaproj;

/**
 *models a car
 * @author ryan.connell
 */
public class Car {
    // public member varidables: we don't need to implement log to change these values
    public int year;
    public String makeModel;
    
     //member variables
     String vin;
     boolean isEngineOn;
     private double speed;
     //stimulates starting this car instance's engine

     public void startEngine(){
         isEngineOn = true;
         System.out.println("...crank...crank...vroom!");
     }//close startEngine
     // stimulates stopping this car instance's engine
     public void stopEngine(){
         isEngineOn = false;
         System.out.println("...grblll...shldunk");
         speed = 0;
     }//close stopEngine
     public double getSpeed() {
         return speed;
     }//close getSpeed
     /**
      * allows access to our private engine status boolean
      * variable called isEngineRunning
      * @return the status of the engine: true means on, false
      */
     public boolean checkEngineStatus(){
         return isEngineOn;
     }//close checkEngineStatus
     public double getCurrentSpeed(){
         return speed;
     }
     /**
      *Allows access to our private speed variable
      * @return this car object's current speed
      */
        public double speed(){
         return speed;
     }//close speed
     /**
      * Controls the car's increases in speed
      * @param mphIncrease
      * @return the current speed of the car after the acceleration 
      * has been taken into account
      */
     public double accelerate (int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
        }//close acclerate
     /**
      * controls the car's decreases in speed
      * @param mphIncrease
      * @return the current speed of the car after the deceleration
      */
     public double decelerate (int mphIncrease){
        speed = speed - mphIncrease;
        return speed;
        }//close acclerate
}//close class
