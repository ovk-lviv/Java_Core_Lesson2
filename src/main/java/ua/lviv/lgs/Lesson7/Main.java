package ua.lviv.lgs.Lesson7;

public class Main {
    public static void main(String[] args) {

        SU27 su27 = new SU27(700, "blue");

        su27.startEngines(20, 88);
        su27.aircraftTakeOff(0, 1000);
        su27.a1.moveUp(200);
        su27.a1.moveLeft(300);
        su27.a1.moveDown(50);
        su27.a1.moveRight(400);
        su27.invisible();
        su27.nuclearLaunch();
        su27.speedUp();
        su27.aircraftLanding();
    }
}
