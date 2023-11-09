package org.example;

import java.util.Scanner;

public class Controller {

    public static void start() {
        Scanner input = new Scanner(System.in);

        System.out.print("""
                1. Box
                2. Pyramid
                3. Sphere
                4. Cylinder
                        
                0. Exit
                Choose shape (number of shape) >>""");

        try {
            switch (input.nextInt()) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.print("Enter base Height >> ");
                    int bHeight = input.nextInt();

                    System.out.print("Enter base width >> ");
                    int bWidth = input.nextInt();

                    System.out.print("Enter height of shape >> ");
                    int height = input.nextInt();

                    Box box = new Box(bHeight, bWidth, height);
                    box.calculateVolume();
                }
                case 2 -> {
                    System.out.print("Enter base Height >> ");
                    int bHeight = input.nextInt();

                    System.out.print("Enter base width >> ");
                    int bWidth = input.nextInt();

                    System.out.print("Enter height of shape >> ");
                    int height = input.nextInt();
                    Pyramid pyramid = new Pyramid(bHeight, bWidth, height);
                    pyramid.calculateVolume();
                }
                case 3 -> {
                    System.out.print("Enter radius >> ");
                    int radius = input.nextInt();
                    Sphere sphere = new Sphere(radius);
                    sphere.calculateVolume();
                }
                case 4 -> {
                    System.out.print("Enter radius >> ");
                    int radius = input.nextInt();

                    System.out.print("Enter height >> ");
                    int height = input.nextInt();
                    Cylinder cylinder = new Cylinder(radius, height);
                    cylinder.calculateVolume();
                }
                default -> {
                    System.out.println("Wrong Choose. Try again");
                    start();
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong Choose. Try again");
            start();
        }
    }
}
