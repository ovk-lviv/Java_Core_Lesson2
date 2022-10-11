package ua.lviv.lgs.Lesson7;

import static ua.lviv.lgs.Lesson7.Service.generateRandom;

public class AircraftControl {


    public void moveUp(int bound) {
        System.out.println("Aircraft moves " + generateRandom(bound) + " meters up");
    }
    public void moveDown(int bound) {
        System.out.println("Aircraft moves " + generateRandom(bound) + " meters down");
    }
    public void moveRight(int bound) {
        System.out.println("Aircraft moves " + generateRandom(bound) + " meters right");
    }
    public void moveLeft(int bound) {
        System.out.println("Aircraft moves " + generateRandom(bound) + " meters left");
    }
}
