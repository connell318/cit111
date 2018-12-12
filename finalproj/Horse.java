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
class Horse {
// methods called in HorseLand
    boolean running;
    String breed;
    String height;
    String weight;
    String color;
    String name;

    public void raceStart() {
        running = true;
    }//close raceStart

    public void raceStop() {
        running = false;
    }//close raceStop
//calls an array to chose a random winner each race ran
    public String[] winner() {
        Random generate = new Random();
        String[] winner = {"Chestnut", "Apollo", "Lightning"};
        System.out.println(winner[generate.nextInt(3)]);
        return winner;
    }
}//close class
