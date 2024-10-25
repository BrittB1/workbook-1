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

       System.out.println("The highest salary is: "+ formattedHighestSalary);

       System.out.println("QUESTION 2: ");

        double truckPrice = 80000;
        double carPrice = 45000;

        double smallestPrice = Math.min(carPrice,truckPrice);

        String formattedSmallestPrice = currencyFormatter.format(smallestPrice);

        System.out.println("The lowest price is: "+ formattedSmallestPrice);


        System.out.println("QUESTION 3: ");

        double radius = 7.25;

        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);


        //Question 4:

    }
}
