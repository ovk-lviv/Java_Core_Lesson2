package ua.lviv.lgs.lesson6.interface3;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator( 3,7);

        myCalculator.add();
        myCalculator.subtract();
        myCalculator.multiply();
        myCalculator.divide();
    }
}
