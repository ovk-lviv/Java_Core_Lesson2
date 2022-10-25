package ua.lviv.lgs.Lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // prompt user to enter some text
        System.out.println("Enter text...");
        Scanner scanner = new Scanner(System.in);

        //text variable holds the entered text
        //easy string example ? not so easy "string": example ! Difficult string example; not as - easy example's 2485 "
        String text = scanner.nextLine();

        //remove all characters that may affect calculating the number of words (with regexp)
        text = text.replaceAll("[!?:;.,\"\'\\-\\d+]", "").replaceAll("\\s{2,}", " ");


        //split the modified text
        String[] array1 = text.split(" ");

        // print out the array of words
        System.out.println(Arrays.toString(array1));

        // print out the number of elements in this array
        System.out.println(array1.length);
    }
}
