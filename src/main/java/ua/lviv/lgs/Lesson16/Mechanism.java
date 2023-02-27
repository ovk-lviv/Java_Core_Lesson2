package ua.lviv.lgs.Lesson16;

public class Mechanism {
    private double weight;
    private double length;
    private double width;
    private double height;

    public void moveLeft(int meters) {

        System.out.println("The mechanism has moved " + meters + " left" );
    }

    public void moveRight(int meters) {
        System.out.println("The mechanism has moved " + meters + " right" );
    }

    public Mechanism(double weight, double length, double width, double height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
