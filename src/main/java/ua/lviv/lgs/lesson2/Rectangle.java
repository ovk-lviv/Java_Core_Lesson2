package ua.lviv.lgs.lesson2;

public class Rectangle {
    private int width;
    private int length;

    Rectangle () {
        this.width = 4;
        this.length=10;

    }
    Rectangle (int width, int length) {
        this.width=width;
        this.length=length;
    }

    public void showPerimeter (int width, int length) {
        System.out.println("Rectangle perimeter: " + 2*(width+length));
    }

    public void showArea (int width, int length) {
        System.out.println("Rectangle area: " + width*length);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

}
