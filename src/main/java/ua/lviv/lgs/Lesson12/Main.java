package ua.lviv.lgs.Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Task 2 redo: Convert array into List.

        int random = new Random().nextInt(5);//setting the random number of elements within list

        ArrayList <Auto> list = new ArrayList <>();//creating empty list


        //with "for" loop create object of Auto and filling the list
        for (int i = 0; i < random; i++) {
             list.add(new Auto(getRandomFromRange(50, 500), getRandomFromRange(1930, 2022), getRandomFromRange(30, 35),
                        getRandomFromString(), getRandomFromRange(3, 4)));

        }
        System.out.println("List: " + list);

        //Task 4a: creating one object of Auto class (remained unchanged):
        Auto auto = new Auto(getRandomFromRange(50, 500), getRandomFromRange(1930, 2022), getRandomFromRange(30, 35),
                getRandomFromString(), getRandomFromRange(3, 4));

        ArrayList <Auto> list1 = new ArrayList<>();

        //Task 4b: filling the list with the same value
        for (int i = 0; i < random; i++) {
            list1.add(auto);

            }

        System.out.println("List1: " + list1);
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
