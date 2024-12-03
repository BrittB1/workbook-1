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


    }
}
