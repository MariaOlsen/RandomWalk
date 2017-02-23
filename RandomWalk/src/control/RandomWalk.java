/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;

/**
 *
 * @author maria
 */
public class RandomWalk {
    
    private int x;
    private int y;
    private int max;
    private int steps;
    private int bounds;
    private int maxDistance;

    public RandomWalk(int bounds, int max) {
        this.max = max;
        this.bounds = bounds;
        x = 0;
        y = 0;
        steps = 0;
        maxDistance = 0;
    }

  
    public RandomWalk(int bounds, int max, int startX, int startY) {
        this.max = max;
        this.bounds = bounds;
        x = startX;
        y = startY;
        steps = 0;
        maxDistance = 0;
    }
    
    
    
     /**
     * Generates a pseudo-random value and changes the objects' coordinates accordingly
     */
    public void takeStep() {

        //Generates a new random integer between 0 - 4
        //Depending on the integer, add or substract 1 from x or y
        Random ran = new Random();
        int step = ran.nextInt(4);

        switch (step) {
            case 0:
                //Right step
                x = x + 1;
                break;
            case 1:
                //Step up
                y = y + 1;
                break;
            case 2:
                //step left
                x = x - 1;

                break;

            case 3:
                //Step down
                y = y - 1;

                break;
        }

        //Increments steps
        steps = steps + 1;
   
        //Update max distance to the greatest number
        //Values are current Max Distance and current distance from origin
        maxDistance = max(maxDistance, (Math.max(Math.abs(x), Math.abs(y))));

    }
    
    
/**
 * Support method. Compares two numbers and returns the greatest value
 * Values: Previous maxDistance, Current Distance from origin
 * @param num1
 * @param num2
 * @return 
 */
    private int max(int num1, int num2) {
        int biggest = 0;

        if (num1 > num2) {
            biggest = num1;
        } else {
            biggest = num2;
        }

        return biggest;
    }
    
       /**
     * Returns true if maximum numbers of steps have been reached
     * @return 
     */
    public boolean moreSteps() {
        boolean returnBool = true;

        if (steps < max) {
            returnBool = true;
        } else {
            returnBool = false;
        }

        return returnBool;
    }

    /**
     * Returns true if coordinates are within the bounds
     * @return 
     */
    public boolean inBounds() {
        boolean returnBool = false;
        if (x <= bounds && x >= 0 - bounds && y <= bounds && y >= 0 - bounds) {
            returnBool = true;
        } else {
            returnBool = false;
        }

        return returnBool;
    }
    
    
     /**
     * Simulates a full random walk that continues for as long as the walk is within bounds and has more steps
     */
    public void walk() {

        while (moreSteps() == true && inBounds() == true) {
            takeStep();
        }
    }
    
      public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

      public int getMaxDistance() {

        return maxDistance;
    }

    
    public String toString() {
        String stringReturn = "";

        stringReturn = "Steps: " + steps + " Pos: (" + x + "," + y + ")";

        return stringReturn;
    }
}
