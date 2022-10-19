package ua.lviv.lgs.Lesson9;

public class Methods {

    public static void add(int a, int b) throws IllegalAccessException, MyException{
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("a and be are less than 0");
        }
        else if ((a==0 && b!=0)||(a!=0 && b==0)){
            throw new ArithmeticException("a or b is 0");
        }
        else if (a==0 && b==0){
            throw new IllegalAccessException("a and b are 0");
        }
        else if (a>0 && b>0) {
            throw new MyException("a and b are greater than 0");
        }else {
            System.out.println(a + b);
        }
    }

    public static void subtract(int a, int b) throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("a and be are less than 0");
        }
        else if ((a==0 && b!=0)||(a!=0 && b==0)){
            throw new ArithmeticException("a or b is 0");
        }
        else if (a==0 && b==0){
            throw new IllegalAccessException("a and b are 0");
        }
        else if (a>0 && b>0) {
            throw new MyException("a and b are greater than 0");
        }else {
            System.out.println(a - b);
        }

    }

    public static void multiply(int a, int b)  throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("a and be are less than 0");
        }
        else if ((a==0 && b!=0)||(a!=0 && b==0)){
            throw new ArithmeticException("a or b is 0");
        }
        else if (a==0 && b==0){
            throw new IllegalAccessException("a and b are 0");
        }
        else if (a>0 && b>0) {
            throw new MyException("a and b are greater than 0");
        }else {
            System.out.println(a * b);
        }

    }

    public static void divide(int a, int b) throws IllegalAccessException, MyException {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("a and be are less than 0");
        }
        else if ((a==0 && b!=0)||(a!=0 && b==0)){
            throw new ArithmeticException("a or b is 0");
        }
        else if (a==0 && b==0){
            throw new IllegalAccessException("a and b are 0");
        }
        else if (a>0 && b>0) {
            throw new MyException("a and b are greater than 0");
        }else {
            System.out.println(a / b);
        }

    }
}
