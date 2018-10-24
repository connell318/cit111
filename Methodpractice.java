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
public class Methodpractice {
    public static void printLocation () {
        System.out.println("I'm in printLocation");
    } //close printLocation
    public static void addTen (int x) {
        int y = x + 10;
        System.out.println("Value of y" + y);
    } // close addTen
    
    
    public static void main(String[] ryan) {
        printLocation (); //call this method
        addTen (6);
        System.out.println("I'm in main");      
    } // close main
} //close class
