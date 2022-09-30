package ua.lviv.lgs.lesson4.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 20, 3);

        System.out.println("Name=" + animal.getName() + ", speed=" + animal.getSpeed() + ", age=" + animal.getAge());

        animal.setName("Cat");
        animal.setSpeed(7);
        animal.setAge(4);

        System.out.println("Name=" + animal.getName() + ", speed=" + animal.getSpeed() + ", age=" + animal.getAge());

    }
}
