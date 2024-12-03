package com.pluralsight.calculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class PresentValueCalculator {
    private Scanner userInput;
    private NumberFormat currencyFormatter;

    public PresentValueCalculator() {
        userInput = new Scanner(System.in);
        currencyFormatter = NumberFormat.getCurrencyInstance();

    }

    public void calculate() {
    }
}


