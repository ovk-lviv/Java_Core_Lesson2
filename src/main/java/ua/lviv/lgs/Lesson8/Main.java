package ua.lviv.lgs.Lesson8;

import java.util.Scanner;

import static ua.lviv.lgs.Lesson8.Service.menu;

public class Main {


    public static void main(String[] args) {
        menu();

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String month;


        Service.Months[] arrMonths = Service.Months.values();
        Service.Seasons[] arrSeasons = Service.Seasons.values();
        String seasonName = "";
        int numberOfDays = 0;
        int indexSeason;
        boolean flag;

        switch (number) {

            case 1:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                flag = false;
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        flag = true;
                        System.out.println("Such month exists");
                    }
                }
                if (!flag) {
                    System.out.println("No such month");
                }
                break;

            case 2:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        seasonName = m.getSeason().toString();
                    }
                    if (m.getSeason().toString().equals(seasonName)) {
                        System.out.println(m.name());
                    }
                }

                break;

            case 3:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        numberOfDays = m.getDays();
                    }
                    if (m.getDays() == numberOfDays) {
                        System.out.println(m.name());
                    }
                }
                break;

            case 4:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                flag = false;
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        numberOfDays = m.getDays();
                    }
                }
                for (Service.Months m : arrMonths) {
                    if (m.getDays() < numberOfDays) {
                        System.out.println(m.name());
                        flag = true;
                    }

                }
                if (!flag) {
                    System.out.println("There are no months with fewer number of days");
                }

                break;

            case 5:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                flag = false;
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        numberOfDays = m.getDays();
                    }
                }
                for (Service.Months m : arrMonths) {
                    if (m.getDays() > numberOfDays) {
                        System.out.println(m.name());
                        flag = true;
                    }

                }
                if (!flag) {
                    System.out.println("There are no months with larger number of days");
                }
                break;

            case 6:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        indexSeason = m.season.ordinal();
                        if (indexSeason >= arrSeasons.length - 1) {
                            System.out.println(arrSeasons[0]);
                        } else {
                            System.out.println(arrSeasons[indexSeason + 1]);
                        }
                    }
                }
                break;
            case 7:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        indexSeason = m.season.ordinal();
                        if (indexSeason == 0) {
                            System.out.println(arrSeasons[arrSeasons.length - 1]);
                        } else {
                            System.out.println(arrSeasons[indexSeason - 1]);
                        }
                    }
                }
                break;

            case 8:
                for (Service.Months m : arrMonths) {
                    if (m.getDays() % 2 == 0) {
                        System.out.println(m.name());
                    }
                }
                break;

            case 9:
                for (Service.Months m : arrMonths) {
                    if (m.getDays() % 2 != 0) {
                        System.out.println(m.name());
                    }
                }
                break;

            case 0:
                System.out.println("Enter month...");
                month = scanner.next().toUpperCase();
                flag=false;
                for (Service.Months m : arrMonths) {
                    if (m.name().equals(month)) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println("Month has even number of days");
                            flag=true;
                        }
                    }
                }
                if (!flag) {
                    System.out.println("Month does not have even number of days");
                }
                break;
            default:
                System.out.println("Something went wrong! Check your inputs");

        }
    }
}






