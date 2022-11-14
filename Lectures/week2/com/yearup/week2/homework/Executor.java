package com.yearup.week2.homework;
import java.util.Scanner;

public class Executor {
    static Scanner scanner = new Scanner(System.in);
    static SolarSystemPlanet sol = new SolarSystemPlanet();

    public static void main(String[] args) {
        String planetName = getPlanetName();
        double radii = getRadius();
        double planetArea = sol.getArea(radii);
        displayArea(planetArea);
        getStar(sol);
        getPos(sol, planetName);


    }

    //Create a method which displays the message “Enter the planet name” and returns the input value from the user as String type.
    public static String getPlanetName() {
        System.out.println("Enter the planet name: ");
        String input = scanner.nextLine();
        return input;
    }
    //Create a method which displays the message “Enter the planet radius” and returns the input value from the user as double type.
    public static double getRadius() {
        System.out.println("Enter the planet radius: ");
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }
    //Create a function which accepts the local variable area and displays the area of the planet with a message “Area of the planet is”. This method does not return anything.
    public static void displayArea(double area) {
        System.out.println("Area of the planet is " + area);
    }


    public static void getStar(SolarSystemPlanet planet1) {
        System.out.println("The star of the planet is " + planet1.getStar());
    }
    //Create a function which accepts the return value from Solarsystem planet position function and displayed the planet position with a message “The positio of the planet is:”
    public static void getPos(SolarSystemPlanet planet1, String planetName) {
        int position = sol.getPos(planetName);
        System.out.println("The position of the planet is: " + position);
    }



    }
