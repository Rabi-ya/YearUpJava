package com.yearup.week2.homework;

public class Planet implements Calculator {
    protected String star;

    //instance variables
    private String planetName;
    private double planetRadius;

    //Implement a method to access Star from subclasses with String return type.
    public String getStar() { //
        return this.star;
    }

    //Modify the calculate area method implemented from interface to use the following formula and return the area;Area = 3.14*radius*radius;
    @Override
    public double getArea(double number1, double number2) {
        return Math.PI * Math.pow(this.planetRadius,2);
    }
    public double getArea(double num1) {
        return 3.14*num1*num1;
        //return Math.PI * Math.pow(num1, 2);
    }

    @Override
    public double getSum(double num1, double num2) {
        return 0;
    }

    @Override
    public double getVolume(double num1, double num2, double num3) {
        return 0;
    }
}