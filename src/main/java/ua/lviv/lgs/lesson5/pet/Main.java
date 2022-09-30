package ua.lviv.lgs.lesson5.pet;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cow.voice();
        dog.voice();
        cat.voice();
    }
}
