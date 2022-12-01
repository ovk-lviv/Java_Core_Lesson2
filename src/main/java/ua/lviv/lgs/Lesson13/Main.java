package ua.lviv.lgs.Lesson13;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parliament parliament;
        parliament = Parliament.getInstance();

        System.out.println("Enter 1 to add fraction");
        System.out.println("Enter 2 to remove fraction");
        System.out.println("Enter 3 to to see all fractions");
        System.out.println("Enter 4 to clear fraction");
        System.out.println("Enter 5 to see fraction deputies");
        System.out.println("Enter 6 to add deputy to fraction");
        System.out.println("Enter 7 to remove deputies from fraction");
        System.out.println("Enter 8 to see the list of deputies that take bribes");
        System.out.println("Enter 9 to see the deputy that took the most bribes");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {

            case 1: {
                System.out.println("Please add fraction");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.nextLine();
                parliament.addFraction(new Fraction(name));
                System.out.println("Fraction added");
                parliament.showFractions();
                break;
            }

            case 2: {
                System.out.println("Please enter the name of fraction to remove");
                Scanner scanner2 = new Scanner(System.in);
                String name = scanner2.nextLine();
                parliament.removeFraction(name);
                parliament.showFractions();
                break;
            }

            case 3: {
                parliament.showFractions();
                break;
            }

            case 4: {
                Fraction fraction = parliament.getFraction("Fraction 1");
                fraction.clearFraction("Fraction 1");
                break;
            }

            case 5: {
                parliament.showFraction("Fraction 1");
                break;

            }

            case 6: {
                parliament.addDeputyToFraction("Fraction 1");
                break;
            }

            case 7: {
                parliament.removeDeputyFromFraction("Fraction 1");
                break;
            }

            case 8: {
                parliament.showAllBribers();
                break;
            }

            case 9: {
                parliament.showGreatestBriber();
                break;
            }

             default: {
                System.out.println("Something went wrong");
                break;
            }


        }

    }
}
