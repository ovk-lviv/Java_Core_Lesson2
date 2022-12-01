package ua.lviv.lgs.Lesson13;

import java.util.Scanner;

public class Deputy extends Person {
    private String lastName;
    private String firstName;
    boolean briber;
    int bribe;

    public Deputy(String firstName, String lastName, boolean briber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.briber = briber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getBribe() {
        return bribe;
    }

    public void setBribe(int bribe) {
        this.bribe = bribe;
    }

    public void bribeDeputy () {
        if (!isBriber()) {
            System.out.println("This deputy cannot be bribed ");
        } else {
            System.out.println("Wow, you can try to bribe the deputy. Enter sum...");
            int bribe = new Scanner(System.in).nextInt();

            if(bribe> 5000) {
                System.out.println("The police is going to put him into jail");
            } else {
                setBribe(bribe);
            }
        }
    }
}
