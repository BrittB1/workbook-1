package com.pluralsight.calculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueCalculator {
    private Scanner userInput;
    private NumberFormat currencyFormatter;

    public FutureValueCalculator() {
        userInput = new Scanner(System.in);
        currencyFormatter = NumberFormat.getCurrencyInstance();

    }


    public void calculate() {

        System.out.println("Enter deposit amount:  $");
        double principal = userInput.nextDouble();
        userInput.nextLine();

        System.out.println("Enter annual interest rate (%): ");
        double annualRate = userInput.nextDouble();
        userInput.nextLine();

        System.out.println("Enter the loan term (years): ");
        int years = userInput.nextInt();
        userInput.nextLine();


        /* Future Value Calculation Formula : FV = PV (1+i) ^ n */

        // n calculates # of compounds per year
        double n = 12 * years;

        // i calculates annualRate divided by 100 divided by 12 months per year
        double i = (annualRate / 100) / 12;

        // pow calculates the base raised to the power of n
        double base = 1 + i;
        double pow = Math.pow(base, n);

        // future value calculates principal amount * pow
        double futureValue = principal * pow;

        System.out.printf("The future value will be: $%.2f\n", futureValue);
    }
}