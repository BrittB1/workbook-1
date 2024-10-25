package com.pluralsight.math;

import java.text.NumberFormat;
import java.util.Locale;


public class MathApp {
    public static void main(String[] args) {

        System.out.println("QUESTION 1: ");

        double bobSalary = 100000;
        double garySalary = 250000;

        double highestSalary = Math.max(bobSalary, garySalary);

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedHighestSalary = currencyFormatter.format(highestSalary);

        System.out.println("The highest salary is: " + formattedHighestSalary);


        System.out.println("QUESTION 2: ");

        double truckPrice = 80000;
        double carPrice = 45000;

        double smallestPrice = Math.min(carPrice, truckPrice);

        String formattedSmallestPrice = currencyFormatter.format(smallestPrice);

        System.out.println("The lowest price is: " + formattedSmallestPrice);


        System.out.println("QUESTION 3: ");

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);


        System.out.println("QUESTION 4: ");

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.printf("The square root of %.1f is: %.2f%n", number, squareRoot);

        System.out.println("QUESTION 5: ");

        // For starters, we need to find out the formula to calculate the distance between two points: d=√((x_2-x_1)²+(y_2-y_1)²)

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("The distance between the points (%.1f, %.1f) and (%.1f, %.1f) is: %.2f%n", x1, y1, x2, y2, distance);

        System.out.println("QUESTION 6: ");
        // The absolute value (also called the modulus) of a real number is its distance from zero
        double variable = -3.8;
        double absoluteValue = Math.abs(variable);

        System.out.printf("The absolute value of %.1f is: %.1f%n", variable, absoluteValue);
    }
}
