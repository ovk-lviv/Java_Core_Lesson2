package ua.lviv.lgs.Lesson10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //prompt user to enter text
        System.out.println("Enter text...");
        Scanner scanner = new Scanner(System.in);

        //variable text holds user input and transforms it into lower case
        String text = scanner.nextLine().toLowerCase();

        //eliminate all non-word items and numbers, as well as exceeding spaces
        text = text.replaceAll("[!?:;.,\"\'\\-\\d+]", "").replaceAll("\\s{2,}", " ");


        // global variables initialization. They are used in loops
        int max = 0;
        int counter = 0;
        String word="";

        // turn text into array
        String[] array = text.split(" ");

        //loop over: the second loop takes n-th item of the first loop and compares to the rest of array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {

                    //if match is found, counter increments
                    counter++;

                    //compare counter value with max value
                    if (counter > max) {
                        max = counter;
                        word=array[i];
                    }
                }
             }
            //counter goes to 0 to start counting the loops' next items again
            counter=0;
       }
        System.out.println("The word "+ word + " is the most frequent word and is displayed " + max + " times");

    }
}
