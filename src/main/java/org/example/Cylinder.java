package org.example;

import java.util.*;

/**
 * 
 */
public class Cylinder extends SolidOfRevolution {

    /**
     * Default constructor
     */
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println(volume);
    }
}