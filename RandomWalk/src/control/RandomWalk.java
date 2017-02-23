/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
    
    
    
    
    public String toString() {
        String stringReturn = "";

        stringReturn = "Steps: " + steps + "Pos: (" + x + "," + y + ")";

        return stringReturn;
    }
}
