package com.twassignment.rectangles;

/**
 * Created by alisonps on 8/15/14.
 */
public class RectangleTester {

    public static void main(String[] args) {
        int SCALE_FACTOR = 10;
        int totalArea = 0;
        int totalPerimeter = 0;

        //Create 5 new rectangles
        Rectangle[] rectangles = new Rectangle[5];

        //Initialize each rectangle. Dimensions should be at least 1.
        for (int i = 0; i < rectangles.length; i = i + 1) {
            rectangles[i] = new Rectangle((int)(Math.random() * SCALE_FACTOR + 1), (int)(Math.random() * SCALE_FACTOR + 1));
        }

        //Calculate total area and perimeter
        for (int i = 0; i < rectangles.length; i = i + 1) {
            totalArea = totalArea + rectangles[i].area();
            totalPerimeter = totalPerimeter + rectangles[i].perimeter();
        }

        System.out.println("The total rectangle area is " + totalArea);
        System.out.println("The total rectangle perimeter is " + totalPerimeter);
    }

}