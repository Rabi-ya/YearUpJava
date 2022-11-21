package com.yearup.week2.homework;
import java.sql.SQLOutput;
import java.util.Scanner;

import static com.yearup.week2.homework.Executor.PlanetName.planetMoon;

public class Executor {
    static Scanner scanner = new Scanner(System.in);
    static SolarSystemPlanet sol = new SolarSystemPlanet();

    /*Create an anonymous class called CelestialObject. This should implement an interface
    with the same name and one method to displayCelestialobject().Override the method and display “Comet is a celestiaL
    object” */
    interface CelestialObject {
        void displayCelestialObject();
    }
    static CelestialObject celestialobyecto = new CelestialObject() {
        @Override
        public void displayCelestialObject() {
            System.out.println("Comet is a celestial object");
        }
    };

    //Create a static class which has one method to display the text “Your planet belongs to Milky way galaxy.”
    public static class MilkywayGalaxy{
        public static void displayMilkyway(){
            System.out.println("Your planet belongs to the Milky way galaxy");
        }
    }

    /*Create an Enum class called PlanetName with all planet names and number of moons.
    Mercury, Earth, Mars, Jupiter, Uranus, Neptune,*/
    public enum PlanetName{
        Mercury (0),
        Earth (0) ,
        Venus (1),
        Mars (2),
        Jupiter (80),
        Saturn (83),
        Uranus (27),
        Neptune (14);

        private int numberofMoons;  //Instance variable

        PlanetName(int numberofMoons) { //Constructor to initialize the instance variable
            this.numberofMoons=numberofMoons;
        }

        public static String planetMoon(){
            System.out.println("Enter planet name: ");
            String input = scanner.nextLine();
            return input;
        }

        public static int returnMoons(PlanetName planet) {
            int moon=0;
            switch (planet) {
                case Mercury:
                case Venus:
                    moon = 0;
                    break;
                case Earth:
                    moon = 1;
                    break;
                case Mars:
                    moon = 2;
                    break;
                case Jupiter:
                    moon = 80;
                    break;
                case Saturn:
                    moon = 83;
                    break;
                case Uranus:
                    moon = 27;
                    break;
                case Neptune:
                    moon = 14;
                    break;
            }
            return moon;
        }



    }

    public static void main(String[] args) {
        String planetName = getPlanetName();
        double radii = getRadius();
        double planetArea = sol.getArea(radii);
        displayArea(planetArea);
        getStar(sol);
        getPos(sol, planetName);

        celestialobyecto.displayCelestialObject();
        MilkywayGalaxy.displayMilkyway();
        PlanetName planet = PlanetName.valueOf(planetMoon());
        System.out.println("The number of moons this planet has is: "+ planet.numberofMoons);

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
    }}
    /*interface CelestialObject {
        void displayCelestialObject();
    }


    static CelestialObject celestialobyecto = new CelestialObject() {
        @Override
        public void displayCelestialObject() {
            System.out.println("Comet is a celestial object");
        }



    };
     */
