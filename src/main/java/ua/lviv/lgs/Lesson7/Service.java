package ua.lviv.lgs.Lesson7;

import java.util.Random;

public class Service {

    public static int generateRandom(int min, int max) {
        int difference = max - min;
        Random random = new Random();
        int i = random.nextInt(difference + 1);
        i += min;
        return i;
    }

    public static int generateRandom(int a) {
        Random random = new Random();
        int i = random.nextInt(a);
        return i;
    }

    public static double generateRandom(int min, double max) {
        double random = new Random().nextDouble();
        double i = max + (random * (max - min));
        return i;
    }
}
