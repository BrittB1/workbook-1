package com.pluralsight.calculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    private final Scanner userInput;
    private final NumberFormat currencyFormatter;
    private final NumberFormat percentFormatter;


    public MortgageCalculator(Scanner userInput, NumberFormat currencyFormatter) {
this.userInput = userInput;
this.currencyFormatter = currencyFormatter;// Uses currency formatter that was declared in the main app
this.percentFormatter = NumberFormat.getPercentInstance(); /** We need a new formatter specifically for percentages, so
                                                            ** it gets created here */
    }
    public void calculate() {
        System.out.println("Enter loan amount:  $");
        double principal = userInput.nextDouble();
        userInput.nextLine();

        System.out.println("Enter annual interest rate (%): ");
        double annualRate = userInput.nextDouble();
        userInput.nextLine();

        System.out.println("Enter the loan term (years): ");
        int years = userInput.nextInt();
        userInput.nextLine();

        /** Mortgage calculation formula: M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1] */

        // 1. Calculates monthly interest rate (i)
        double i = (annualRate / 100) / 12 ;

        //2. Calculates total # of payments (n)
        int n = years * 12;

        //3. Calculates (1 + i) - base for the power calculation
            double base = 1 + i;

        // 4. Calculates (1 + i)^n -
        double pow = Math.pow (base,n);

        // M = [P * i * pow] / [pow - 1]

        double monthlyPayment = (principal * i * pow) / (pow - 1);
        System.out.printf("Your payment will be: $%.2f\n",monthlyPayment);

     }
}
