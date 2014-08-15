package com.twassignment.rectangles;

/**
 * Created by alisonps on 8/15/14.
 */
public class Rectangle {

    private int height;
    private int width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return height * width;
    }

    public int perimeter() {
        return 2 * height + 2 * width;
    }
}
