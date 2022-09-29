package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {
        //Create object with constructor without parameters
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle1 length: " + rectangle1.getLength());
        System.out.println("Rectangle1 width: " + rectangle1.getWidth());

        //Create object with constructor with parameters
        Rectangle rectangle2 = new Rectangle(8,15);
        System.out.println("Rectangle2 width: " + rectangle2.getWidth());
        System.out.println("Rectangle2 length: " + rectangle2.getLength());

        //Show perimeter and area of rectangle1
        rectangle1.showPerimeter(rectangle1.getWidth(), rectangle1.getLength());
        rectangle1.showArea(rectangle1.getWidth(), rectangle1.getLength());

        //Show perimeter and area of rectangle2
        rectangle2.showPerimeter(rectangle2.getWidth(), rectangle2.getLength());
        rectangle2.showArea(rectangle2.getWidth(), rectangle2.getLength());


        //Create Circle object and show its area and circumference
        Circle circle = new Circle(3.5);
        System.out.println(circle.showArea());
        System.out.println(circle.showCircumference());






    }

}
