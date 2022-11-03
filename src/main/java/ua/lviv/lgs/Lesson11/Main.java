package ua.lviv.lgs.Lesson11;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Task 1: creating 2D array with randomly chosen length
        Auto[][] array = new Auto[new Random().nextInt(5)][new Random().nextInt(5)];

        // Auxiliary methods to see the lengths from task1 (not from Homework scope)
        System.out.println(array.length);
        System.out.println(array[0].length);

        // Task 2: Fill in the array with objects of Auto with randomly set values
        for (int i = 0; i < array.length; i++) {// "outer" array
            for (int j = 0; j < array[i].length; j++) {// inner "array"
                Arrays.fill(array[i], new Auto(getRandomFromRange(50, 500), getRandomFromRange(1930, 2022), getRandomFromRange(30, 35),
                        getRandomFromString(), getRandomFromRange(3, 4)));
            }
        }

        //Task 3: created object data printed in console:
        System.out.println(Arrays.deepToString(array));

        //Task 4a: creating one object of Auto class:
        Auto auto = new Auto(getRandomFromRange(50, 500), getRandomFromRange(1930, 2022), getRandomFromRange(30, 35),
                getRandomFromString(), getRandomFromRange(3, 4));

        //Task 4b: filling array with the same value
        for (int i = 0; i < array.length-1; i++) {// "outer" array
            for (int j = 0; j < array[i].length; j++) {// inner "array"
                Arrays.fill(array[i], auto);
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    // auxiliary method to pick random value from integers
    public static int getRandomFromRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Min value cannot be larger than max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    //auxiliary method to pick random value from strings
    public static String getRandomFromString() {
        String[] styles = new String[]{"leather", "alcantara"};
        int length = styles.length;
        Random r = new Random();
        int index = r.nextInt(length);
        return styles[index];

    }
}
