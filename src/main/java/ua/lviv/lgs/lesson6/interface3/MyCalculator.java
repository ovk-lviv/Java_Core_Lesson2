package ua.lviv.lgs.lesson6.interface3;

import ua.lviv.lgs.lesson6.interface2.Numerable;

public class MyCalculator implements Numerable {
    private int a;
    private int b;

    MyCalculator (int a, int b) {
        this.a=a;
        this.b=b;
    }

    public void add() {
        System.out.println(a+b);
    }

    public void subtract() {
        System.out.println(a-b);
    }

    public void multiply() {
        System.out.println(a*b);
    }

    public void divide() {
        System.out.println(a/b);
    }
}
