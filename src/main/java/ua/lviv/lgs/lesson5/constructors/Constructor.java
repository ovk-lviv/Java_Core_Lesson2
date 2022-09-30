package ua.lviv.lgs.lesson5.constructors;

public class Constructor {
    private String color;
    private String shape;
    private int corners;
    private int sides;

    Constructor (String color, int corners) {
        this.color=color;
        this.corners=corners;
    }

    Constructor (String color, int corners, int sides, String shape ) {
        this (color, corners);
        this.sides=sides;
        this.shape=shape;
    }

}
