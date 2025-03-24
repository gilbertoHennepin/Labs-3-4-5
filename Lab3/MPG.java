package week3;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {
        double miles = doubleInput("enter number of miles driven:");
        double gas = doubleInput("Enter gallons of gas used:");

        double mpg = milesPerGallon(miles, gas);
        System.out.println("The MPG for this journey is " + mpg + " miles per gallon");

    }

    public static double milesPerGallon(double miles, double gallons) {
        double mpg = miles / gallons;
        return mpg;
    }
}
