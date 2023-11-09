package org.example;

import java.util.*;

/**
 * 
 */
public class Pyramid extends SquareShape {

    /**
     * Default constructor
     */
    public Pyramid(int baseHeight, int baseWidth, int height) {
        this.baseHeight = baseHeight;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        baseSquare = baseHeight * baseWidth;
        double volume = ((double) 1/3) * baseSquare * height;
        System.out.println(volume);
    }
}