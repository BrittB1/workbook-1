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

        double n = 12 * years;

        double i = (annualRate / 100) / 12;

        double base = 1 + i;
        double pow = Math.pow(base, n);

        double futureValue = principal * pow;

        System.out.printf("The future value will be: $%.2f\n", futureValue);
    }
}