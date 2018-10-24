/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2method1;

/**
 *
 * @author ryan.connell
 */
public class Geo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call a method requing no input argument, but returns nothing:
    //    displayFortune();
        // call a method that requiries an input argument, and returns nothing
    //     displayPriceWithTax(100.0);
    
        // call a method that requires an imput argument, and returns a double
        double result = calcVolumeOfCube(50.0);
        // print out the return value
        System.out.println("The volume of the cube is: " + result);
    
    }//close main
    
    //declare a method and write its body
    public static void displayPattern(){
        System.out.println("X**X*");
        System.out.println("*X**X");
        System.out.println("**X**");
        System.out.println("X**X*");
}//close displayPattern method
    
    //requires one input parameter of type double, returns nothing
    public static double displayPriceWithTax(double price){
        final double TAX_RATE = 0.07;
        double totalPrice = price * (1 + TAX_RATE);
        return totalPrice;
    }//close displayPriceWithTax method
    
    // requires one input paramter of type double, and returns a double value
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        //return the area back to the calling method
        return cubeVolume;
      
    } //close calcVolumeOfCube method
    
    
}// close class
