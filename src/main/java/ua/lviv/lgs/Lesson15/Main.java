package ua.lviv.lgs.Lesson15;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 to add Zooclub member");
        System.out.println("Enter 2 to add pet to a member");
        System.out.println("Enter 3 to remove pet from a member");
        System.out.println("Enter 4 to remove a member");
        System.out.println("Enter 5 to remove pet from all members");
        System.out.println("Enter 6 to show zooclub");
        System.out.println("Enter 7 to exit");

        Zooclub zooclub = new Zooclub();
//test data below to see if methods work properly
        zooclub.addMember (new Person("Ricky", 12));
        zooclub.addMember(new Person ("Tom", 34));
        zooclub.addMember(new Person("Evy", 45));
        zooclub.addPetToMember("Tom", new Pet ("bird", "Waldo") );
        zooclub.addPetToMember("Tom", new Pet ("tortoise", "Torti"));
        zooclub.addPetToMember("Evy", new Pet("bird", "Koko"));

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);


        switch (number) {

            case 1: {
                System.out.println("Enter person's name...");
                String name = scanner1.nextLine();
                System.out.println("Enter person's age...");
                int age = scanner1.nextInt();
                zooclub.addMember(new Person(name, age));
                zooclub.showZooclub();

                break;
            }

            case 2: {
                System.out.println("Enter person's name...");
                String name = scanner1.nextLine();
                System.out.println("Enter pet's type (cat, dog, horse...)...");
                String type = scanner1.nextLine();
                System.out.println("Enter pet's name...");
                String petName = scanner1.nextLine();
                zooclub.addPetToMember(name, new Pet(type, petName));
                zooclub.showZooclub();

                break;
            }

            case 3: {
                System.out.println("Enter person's name...");
                String name = scanner1.nextLine();
                System.out.println("Enter pet's type (cat, dog, horse...)...");
                String type = scanner1.nextLine();
                System.out.println("Enter pet's name...");
                String petName = scanner1.nextLine();
                zooclub.removePetFomMember(name,type, petName);
                zooclub.showZooclub();

                break;
            }

            case 4: {
                System.out.println("Enter person's name...");
                String name = scanner1.nextLine();
                zooclub.removeMember(name);
                zooclub.showZooclub();

                break;

            }
            case 5: {
                System.out.println("Enter pet's type (cat, dog, horse...)...");
                String type = scanner1.nextLine();
                zooclub.removePetFromMembers(type);
                zooclub.showZooclub();

                break;

            }

            case 6: {
                zooclub.showZooclub();
                break;
            }

            case 7: {
                System.exit(0);
                break;
            }

            default: {
                System.out.println("Something went wrong");
            }


        }
    }
}
