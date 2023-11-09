package org.example;
import java.util.*;

/**
 * 
 */
public class Sphere extends SolidOfRevolution {

    /**
     * Default constructor
     */
    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        double volume = ((double) 4 /3) * Math.PI * Math.pow(radius, 3);
        System.out.println(volume);
    }
}