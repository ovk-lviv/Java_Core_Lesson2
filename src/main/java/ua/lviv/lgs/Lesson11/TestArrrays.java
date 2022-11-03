package ua.lviv.lgs.Lesson11;

import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class TestArrrays {

    public static void main(String[] args) {
        int randomArrayLength = new Random().nextInt(30);

        Integer [] array1 = new Integer[randomArrayLength];

        for (int i = 0; i < array1.length; i++) {
            int randomValue = new Random().nextInt(100);
            array1[i] = randomValue;
        }

        System.out.println("Unsorted array: " + Arrays.toString(array1));

        Arrays.sort(array1);
        System.out.println("Array sorted ASCENDING: " + Arrays.toString(array1));

        Arrays.sort(array1, Collections.reverseOrder());
        System.out.println("Array sorted DESCENDING: " + Arrays.toString(array1));

    }

}
