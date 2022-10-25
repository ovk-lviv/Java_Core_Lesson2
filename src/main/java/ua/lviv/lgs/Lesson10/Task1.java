package ua.lviv.lgs.Lesson10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws InvalidLengthException {
        //prompt user to enter the word
        System.out.println("Enter word of 5 letters...");
        Scanner scanner = new Scanner(System.in);

        // input variable holds data that user entered, transformed to lower case
        String input = scanner.next().toLowerCase();

        //checking the length and type od data entered and throwing exception if data is invalid
        if (input.length() != 5 || !input.getClass().getName().equals("String")) {
            throw new InvalidLengthException("Input length is not 5 or input is not String");
        }

        //creating object that holds reversed value of the entered string
        String reversed = new StringBuffer(input).reverse().toString();

        //comparing 2 strings
        if (input.equals(reversed)) {
            System.out.println("The word is palindrome");
        }

    }


}
