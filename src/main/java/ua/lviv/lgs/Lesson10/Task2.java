package ua.lviv.lgs.Lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //prompt user to enter value
        System.out.println("Enter line...");
        Scanner scanner = new Scanner(System.in);

        //line value holds user's input
        String line = scanner.nextLine();

        // an array that holds all vowels of English alphabet
        String[] array = new String[]{"a", "e", "i", "o", "u", "y"};

        // taking every value from vowels array and replace it in input variable
        for (String s : array) {
            line = line.replace(s, "-");
        }

        System.out.println(line);
    }
}
