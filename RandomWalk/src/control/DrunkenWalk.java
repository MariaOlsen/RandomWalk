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
public class DrunkenWalk {

    private int bounds;
    private int max;
    private int drunks;
    private int counter;
    private RandomWalk ranWalk;

    public DrunkenWalk(int bounds, int max, int drunks) {
        this.bounds = bounds;
        this.max = max;
        this.drunks = drunks;
        counter = 0;
    }

    /**
     * Causes the object to 'walk' and increments counter if the coordinates
     * reaches out of bounds
     */
    public void drunkWalks() {

        for (int i = 0; i < drunks; i++) {
            ranWalk = new RandomWalk(bounds, max);
            ranWalk.walk();

            if (ranWalk.inBounds() == false) {
                counter = counter + 1;
            }
        }
    }

    public String toString() {
        String printString = "";

        printString = "Out of " + drunks + " walks, the drunk fell off " + counter + " time(s)";

        return printString;

    }

}
