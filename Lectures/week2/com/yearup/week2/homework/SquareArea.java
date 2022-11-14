package com.yearup.week2.homework;
import java.util.Scanner;

public class SquareArea implements Calculator {
    private double areaValue;
    private double squareLength;

    private static double r;

    public void displayArea() {
        System.out.println("The area of the square is: " + areaValue);
    }

    public static void main(String[] args) {
        SquareArea s = new SquareArea();
        r=input();      //local variable to then store return value
        System.out.println(s.area2(r));
    }

    public double area2(double r){
        double area2= r *r;
        return area2;
    }
    public static double input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length!: ");
        return input.nextDouble();
    }
    @Override
    public double getArea(double number1, double number2) {
        this.areaValue = number1*number2;
        return this.areaValue;
    }
    // The display message to get user input and assigning the scanner value to a variable should be done in a separate method.
    public void setLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length value!: ");
        this.squareLength = sc.nextDouble();
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