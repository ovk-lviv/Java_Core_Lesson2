package ua.lviv.lgs.Lesson7;

import static ua.lviv.lgs.Lesson7.Service.generateRandom;

public class SU27 extends Aircraft implements Turbo, Stealth, Nuclear {
    AircraftControl a1= new AircraftControl();

    private int maxSpeed;
    private String color;

    public SU27(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void speedUp() {
        System.out.println("Aircraft turbo speed is " + generateRandom(maxSpeed, 1000));
    }

    @Override
    public void invisible() {
        System.out.println("Aircraft is invisible for " + generateRandom(600) + " seconds");

    }

    @Override
    public void nuclearLaunch() {
        System.out.println("Aircraft drops " + generateRandom(10) + " nuclear warheads");
    }

}
