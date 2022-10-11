package ua.lviv.lgs.Lesson7;

import static ua.lviv.lgs.Lesson7.Service.generateRandom;

public abstract class Aircraft {
    double aircraftLength;
    double aircraftWidth;
    double aircraftWeight;

    public void startEngines(int from, int to) {
        System.out.println("Aircraft ready in " + generateRandom(from, to) + " seconds");
    }

    public void aircraftTakeOff (int from, double distance) {
        System.out.println("Aircraft can sustain flight for " + generateRandom(from, distance) + " kilometers");
    }

    public void aircraftLanding (){
        System.out.println("Aircraft is landing");
    }


}
