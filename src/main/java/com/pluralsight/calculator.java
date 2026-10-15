package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // initiate scanner
        Scanner myScanner = new Scanner(System.in);

        // user gets prompted to pick 2 numbers
        System.out.print("Enter the first number: ");
        int firstNumber = myScanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = myScanner.nextInt();

        // user sees a menu with options
        System.out.println("Which operation would you like to do?");
        System.out.println("(A) Add");
        System.out.println("(S) Subtract");
        System.out.println("(M) Multiply");
        System.out.println("(D) Divide");
        System.out.print("Please select an option: ");

        // took user input and converted to uppercase
        String mathOperation = myScanner.next().toUpperCase();

        // signal that user input has ended
        myScanner.close();

        // switch case based on user input to handle specific operations
        switch (mathOperation) {
            case "A":
                System.out.println("You selected Add!");
                break;
            case "S":
                System.out.println("You selected Subtract!");
                break;
            case "M":
                System.out.println("You selected Multiply!");
                break;
            case "D":
                System.out.println("You selected Divide!");
                break;
            default:
                System.out.println("Invalid option. Try again!");
                break;
        }



    }
}
