package ua.lviv.lgs.Lesson12;

import java.util.*;

public class TestArrrays {

    public static void main(String[] args) {

        int random  = new Random().nextInt(10);
        System.out.println(random);

        List <Integer> list = new ArrayList<>();

        for (int i = 0; i < random; i++) {
            int randomValue = new Random().nextInt(100);
            list.add(randomValue);
        }

        System.out.println("Unsorted list: " + list);

        Collections.sort(list);
        System.out.println("List sorted ASCENDING: " +  list);

        Collections.reverse(list);
        System.out.println("List sorted DESCENDING: " + list);

    }

}
