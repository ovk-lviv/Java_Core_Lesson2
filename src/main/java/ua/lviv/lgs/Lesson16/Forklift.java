package ua.lviv.lgs.Lesson16;

public class Forklift extends Mechanism implements Transportable {
    private int capacity=300;

    public Forklift(double weight, double length, double height, double width, int capacity) {
        super(weight, length, width, height);
        this.capacity = capacity;

    }

    @Override
    public boolean moveToOrbit() {
        return true;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
