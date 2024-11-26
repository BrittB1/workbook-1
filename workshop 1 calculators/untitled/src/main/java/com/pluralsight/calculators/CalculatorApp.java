
// Tells Java which folder/package the code belongs to
package com.pluralsight.calculators;

// These are import statements that tell Java I want to use these special tools
import java.text.NumberFormat;
import java.util.Scanner;

// Class that encompasses all the code for the app
public class CalculatorApp {

    /* 'Private' is an access modifier that makes these variables only
     able to be used in this class. 'Scanner' is a class from Java's library while
     'userInput' is the name of our scanner variable. We can name it whatever we want but
     its best practice for the name to tell us about what it does. The benefit of making
      these variables private is that they only need to be created once*/
    private Scanner userInput;
    private NumberFormat currencyFormatter;

    //These statements let us add color to our text
    // 'public static final' means they can be used anywhere and won't change
    // 'String RESET' just the text back to its normal color

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Method to display welcome banner when program starts
    private void displayWelcomeBanner() {

        /* Triple quotes (""") are used for multi-line text blocks.
        They eliminate the need for escape characters (\n), maintain
        formatting, and make creating ASCII art easier*/
        System.out.println(BLUE + """
                ╔════════════════════════════════════════════╗
                ║                                            ║
                ║     Welcome to Financial Calculator        ║
                ║                                            ║
                ╚════════════════════════════════════════════╝
                """ + RESET);
    }


    /* Constructor always has the same name as the class and there can be
     * more than one within a single class.It tells Java how to 'set up' any
     * new objects that are created*/
    public CalculatorApp() {

        // 'system.in tells this variable to 'read from the keyboard'
        userInput = new Scanner(System.in);

        /* This statement has several parts
         * -currencyFormater: The variable's name
         * -NumberFormat: Class that formats numbers as money.
         * adds the correct currency symbol, commas, and decimal places*/
        currencyFormatter = NumberFormat.getCurrencyInstance();

    }

    private void displayMenu() {
        System.out.println(CYAN + """
                        ╔════════════════════════════════════════════╗
                        ║           FINANCIAL CALCULATOR             ║
                        ╠════════════════════════════════════════════╣
                        ║                                            ║
                        ║   [1] 🏠 Mortgage Calculator               ║
                        ║   [2] 💰 Future Value Calculator           ║
                        ║   [3] ❌ Exit                              ║
                        ║                                            ║
                        ╚════════════════════════════════════════════╝
                
                """ + RESET);
    }
/* This method declaration has several parts
* - private: Only this class can use this method
* - void: This method won't return anything
* - showError: Name of the method
* -String message : Takes a message as input
* */
    private void showErrorMessage(String message){

        // %s is a placeholder for our message since this method will be used for any error message that's returned
        System.out.println(RED + """
                
                        ╔════════════ ERROR ══════════════╗   
                        ║ %s                              ║
                        ╚═════════════════════════════════╝
                
                
                
                """.formatted(message) + RESET); // this puts the message where the %s is
    }
    public void start() {

        displayWelcomeBanner();

        while (true) {
            displayMenu();

            System.out.print(YELLOW + "Hello! Which calculator would you like to use? Pick a letter (A-C) for your choice: " + RESET);

            try {
String selection = userInput.nextLine();

switch (selection){

    case M:
        calculateMortgage();
        break;
    case F:
        calculateFutureValue();
        break;
    case X:
        System.out.println(CYAN + """
                          ╔════════════════════════════════════════════╗
                          ║          Thank you for using the           ║
                          ║            Financial Calculator!           ║
                          ╚════════════════════════════════════════════╝
                
                
                
                """ + RESET);
        return;
    default:
        showErrorMessage("Oops! That's not an option. Please try again");
}
            } catch (Exception e) {
                showErrorMessage("Oops! Please enter a letter");
                userInput.next();

            }
        }
        }

    }
// This is a method that starts our program + displays the main menu
