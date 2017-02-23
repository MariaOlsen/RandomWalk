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

//        //1-5) Random Walks
//        System.out.println("Random Walks:");
//        boolean endTry = false;
//
//        while (endTry == false) {
//
//            try {
//
//                System.out.println("Enter the boundary length:");
//                maxCoord = scan.nextInt();
//
//                System.out.print("Enter the maximum number of steps: ");
//                maxSteps = scan.nextInt();
//
//                System.out.print("Enter the starting x and y coordinates with "
//                        + "a space between: ");
//
//                x = scan.nextInt();
//                y = scan.nextInt();
//
//                endTry = true;
//            } catch (InputMismatchException ex) {
//                System.out.println("Input Mismatch: Please type an integer\n");
//                endTry = false;
//            }
//        }
//
//        
//        RandomWalk walk1 = new RandomWalk(10, 5);
//        System.out.println("\nWalk1 initial position:\n" + walk1.toString());
//        //Walk 1 coordinates
//        for (int i = 0; i < 5; i++) {
//            walk1.takeStep();
//            System.out.println("\nNew walk1 position: " + walk1.toString());
//
//        }
//
//        
//        RandomWalk walk2 = new RandomWalk(maxCoord, maxSteps, x, y);
//        System.out.println("\nWalk2 initial position:\n" + walk2.toString());
//        //Walk 2 coordinates
//        for (int i = 0; i < maxSteps; i++) {
//
//            walk2.takeStep();
//            System.out.println("\nNew walk2 position: " + walk2.toString());
//        }

        // RandomWalk method 'walk' test
        for (int i = 0; i < 5; i++) {
            RandomWalk walk3 = new RandomWalk(10, 200);
            walk3.walk();
            System.out.println(walk3.toString());
        }

    }
}
