package ua.lviv.lgs.Lesson9;

public class Main {
    public static void main(String[] args) throws MyException, IllegalAccessException {
        Methods.add(3, 16);
        Methods.add(-2, -3);
        Methods.add(0, -3);
        Methods.add(-1, 0);
        Methods.add(0,0);

        Methods.subtract(3, 16);
        Methods.subtract(-2, -3);
        Methods.subtract(0, -3);
        Methods.subtract(-1, 0);
        Methods.subtract(0,0);

        Methods.multiply(3, 16);
        Methods.multiply(-2, -3);
        Methods.multiply(0, -3);
        Methods.multiply(-1, 0);
        Methods.multiply(0,0);

        Methods.divide(3, 16);
        Methods.divide(-2, -3);
        Methods.divide(0, -3);
        Methods.divide(-1, 0);
        Methods.divide(0,0);

    }
}
