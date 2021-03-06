// ************************************************************
// TestWalk.java
//
// Program to test m3ethods in the RandomWalk class.
// ************************************************************
package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import control.*;

public class TestWalk {

    public static void main(String[] args) {

        int maxSteps = 0; // maximum number of steps in a walk
        int maxCoord = 0; // the maximum x and y coordinate
        int x = 0, y = 0; // starting x and y coordinates for a walk

        Scanner scan = new Scanner(System.in);

        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        System.out.println("-------\tStart\t--------");

        //1-5) Random Walks
        System.out.println("Random Walks:");
        boolean endTry = false;

        while (endTry == false) {

            try {

                System.out.println("Enter the boundary length:");
                maxCoord = scan.nextInt();

                System.out.print("Enter the maximum number of steps: ");
                maxSteps = scan.nextInt();

                System.out.print("Enter the starting x and y coordinates with "
                        + "a space between: ");

                x = scan.nextInt();
                y = scan.nextInt();

                endTry = true;
            } catch (InputMismatchException ex) {
                System.out.println("Input Mismatch: Please type an integer\n");
                endTry = false;
            }
        }

        

        RandomWalk walk1 = new RandomWalk(10, 5);
        System.out.println("\nWalk1 initial position:\n" + walk1.toString());
        //Walk 1 coordinates
        for (int i = 0; i < 5; i++) {
            walk1.takeStep();
            System.out.println("\nNew walk1 position: " + walk1.toString());

        }
        //#11) Max Distance Walk1 in Random Walks test
        System.out.println("Walk2 MAX: " + walk1.getMaxDistance() + "\n");

        
        
        RandomWalk walk2 = new RandomWalk(maxCoord, maxSteps, x, y);
        System.out.println("\nWalk2 initial position:\n" + walk2.toString());
        
        //Walk 2 coordinates
        for (int i = 0; i < maxSteps; i++) {

            walk2.takeStep();
            System.out.println("\nNew walk2 position: " + walk2.toString());
        }

        //#11) Max Distance Walk2 in Random Walks test
        System.out.println("Walk2 MAX: " + walk2.getMaxDistance() + "\n");


        
        
        
//         //#8) Drunken Walks Test
//        System.out.println("\nDrunken Walks");
//        System.out.println("\n-----\t Drunk1 \t-----");
//        DrunkenWalk drunk1 = new DrunkenWalk(10, 200, 30);
//        drunk1.drunkWalks();
//        System.out.println(drunk1.toString());
//
//        System.out.println("\n-----\t Drunk2 \t-----");
//        DrunkenWalk drunk2 = new DrunkenWalk(10, 500, 30);
//        drunk2.drunkWalks();
//        System.out.println(drunk2.toString());
//
//        System.out.println("\n-----\t Drunk3 \t-----");
//        DrunkenWalk drunk3 = new DrunkenWalk(50, 200, 30);
//        drunk3.drunkWalks();
//        System.out.println(drunk3.toString());


// // #9) Collisions
//        System.out.println("\n\t Collisions:");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("\n-----\t Collision# " + i + "\t-----");
//            Collision collision = new Collision();
//            System.out.println(collision.toString());
//        }
//        
//        

    }
}
