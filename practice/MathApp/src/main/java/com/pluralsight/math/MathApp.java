package com.pluralsight.math;

import java.text.NumberFormat;
import java.util.Locale;

public class MathApp {
    public static void main(String[] args) {

        double bobSalary = 100000;
        double garySalary = 250000;

       double highestSalary = Math.max(bobSalary, garySalary);

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedHighestSalary = currencyFormatter.format(highestSalary);

       System.out.println("The highest salary is: "+ formattedHighestSalary);

    }
}
