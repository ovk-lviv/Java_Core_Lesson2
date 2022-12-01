package ua.lviv.lgs.Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fraction {
    private String fractionName;
    private List<Deputy> fractionDeputies;

    public Fraction(String fractionName) {
        this.fractionName = fractionName;
        this.fractionDeputies = new ArrayList<>();

    }

    public String getFractionName() {
        return fractionName;
    }

    private List<Deputy> getFractionDeputies() {
        return fractionDeputies;
    }

    public void addDeputy(String fractionName) {

        while (true) {
            System.out.println("Add new deputy to" + fractionName + "? y/n");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("y")) {
                Scanner scanner1 = new Scanner(System.in);
                Deputy deputy = new Deputy(scanner1.next(), scanner1.next(), scanner1.nextBoolean());
                deputy.bribeDeputy();
                this.fractionDeputies.add(deputy);

            } else {
                break;
            }
        }

    }

    public void showFractionDeputies() {
        for (Deputy d : this.fractionDeputies) {
            System.out.println(d.getFirstName() + " " + d.getLastName());
        }
    }

    public void removeDeputy(String fractionName) {
        System.out.println("Remove deputy from " + fractionName);
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        String lName = scanner.nextLine();

        while (this.fractionDeputies.iterator().hasNext()) {
            Deputy d = this.fractionDeputies.iterator().next();
            if (d.getFirstName().equals(fName) && d.getLastName().equals(lName)) {
                this.fractionDeputies.remove(d);
                System.out.println("Deputy has been successfully removed");
            } else {
                System.out.println("The name is incorrect or the deputy has been already removed");
                break;
            }
        }
    }

    public void showBribers() {
        for (Deputy d : this.fractionDeputies) {
            if (d.isBriber()) {
                System.out.println(d.getFirstName() + " " + d.getLastName());
            }
        }
    }

    public void getGreatestBriber() {
        int max = 0;
        for (Deputy d : this.fractionDeputies) {
            int maxBribe = d.getBribe();
            if (maxBribe > max) {
                max = maxBribe;
                System.out.println(d.getFirstName() + " " + d.getLastName());
            }
        }
    }

    public void clearFraction(String name) {
        List<Deputy> deputies = this.fractionDeputies;
        while (deputies.iterator().hasNext()) {
            this.fractionDeputies.remove(deputies.iterator().next());
            ;
        }
    }
}

