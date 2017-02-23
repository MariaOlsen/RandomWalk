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
public class Collision {

    private RandomWalk ranWalk1;
    private RandomWalk ranWalk2;
    int collision = 0;

    public Collision() {
        ranWalk1 = new RandomWalk(2000000, 100000, -3, 0);
        ranWalk2 = new RandomWalk(2000000, 100000, 3, 0);

        while (ranWalk1.moreSteps() == true || ranWalk2.moreSteps() == true) {
            ranWalk1.takeStep();
            ranWalk2.takeStep();
            if (samePosition(ranWalk1, ranWalk2) == true) {
                collision = collision + 1;
            }
        }
    }

    /**
     * Returns 'true' if two Walks contain the same coordinates (either X or Y)
     * @param p1
     * @param p2
     * @return 
     */
    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        boolean posTrue = false;
      if ((p1.getX() == p2.getX()) || (p1.getY() == p2.getY())) {
          posTrue = true;
        }

        return posTrue;
    }

    public String toString() {
        String str = "";

        str = "#Collisions: " + collision;

        return str;

    }

}
