package org.example;

import java.util.*;

/**
 * 
 */
public class Box extends SquareShape {

    /**
     * Default constructor
     */
    public Box(int baseHeight, int baseWidth, int height) {
        this.baseHeight = baseHeight;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        baseSquare = baseHeight * baseWidth;
        System.out.println(baseSquare * height);
    }
}