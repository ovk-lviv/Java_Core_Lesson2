package ua.lviv.lgs.lesson2;

public class Circle {
    private double radius;
    private double diameter;

    Circle (double radius) {
        this.radius=radius;
        this.diameter = 2*radius;
    }

    public double showCircumference () {
        return 2*Math.PI*this.radius;
    }

    public double showArea () {
        return (Math.PI/4)*Math.pow(this.diameter,2);
    }
}
