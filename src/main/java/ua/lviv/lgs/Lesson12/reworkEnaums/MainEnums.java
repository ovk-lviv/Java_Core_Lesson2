package ua.lviv.lgs.Lesson12.reworkEnaums;

import ua.lviv.lgs.Lesson8.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ua.lviv.lgs.Lesson8.Service.menu;

public class MainEnums {

        public static void main(String[] args) {
            menu();

            Scanner scanner = new Scanner(System.in);
            // a number that user enters after he sees the menu
            int number = scanner.nextInt();

            // variable is used multiple times
            String month;

            List <String> seasons = new ArrayList <> ();
            seasons.add(0, "WINTER");
            seasons.add(1, "SPRING");
            seasons.add(2, "SUMMER");
            seasons.add(3, "AUTUMN");

            List <Month> months = new ArrayList<>();
            months.add(0, new Month("January", 31, "WINTER"));
            months.add(1, new Month("February", 28, "WINTER"));
            months.add(2, new Month("March", 31, "SPRING" ));
            months.add(3, new Month("April", 30, "SPRING"));
            months.add(4, new Month("May", 31, "SPRING"));
            months.add(5, new Month("June", 30, "SUMMER"));
            months.add(6, new Month("July", 31, "SUMMER"));
            months.add(7, new Month("August", 31, "SUMMER"));
            months.add(8, new Month("September", 30, "AUTUMN"));
            months.add(9, new Month("October", 31, "AUTUMN"));
            months.add(10, new Month("November", 30, "AUTUMN"));
            months.add(11, new Month("December", 31, "WINTER"));


            // values to be used down in the code
            String seasonName = "";
            int numberOfDays = 0;
            int indexSeason;
            boolean flag;
            // block of code selecting the info to be displayed to the user depending on the number picked
            try {

                switch (number) {

                    case 1:
                        System.out.println("Enter month...");
                        month = scanner.next().toLowerCase();
                        flag = false;
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
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
                        month = scanner.next().toLowerCase();
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
                                seasonName = m.getSeason();
                            }
                        }
                        for (Month m : months) {
                            if (m.getSeason().equals(seasonName)) {
                                System.out.println(m.getName());
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Enter month...");
                        month = scanner.next().toLowerCase();
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
                                numberOfDays = m.getDays();
                            }
                        }
                        for (Month m : months) {
                            if (m.getDays() == numberOfDays) {
                                System.out.println(m.getName());
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Enter month...");
                        month = scanner.next().toLowerCase();
                        flag = false;
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
                                numberOfDays = m.getDays();
                            }
                        }
                        for (Month m : months) {
                            if (m.getDays() < numberOfDays) {
                                System.out.println(m.getName());
                                flag = true;
                            }

                        }
                        if (!flag) {
                            System.out.println("There are no months with fewer number of days");
                        }

                        break;

                    case 5:
                        System.out.println("Enter month...");
                        month = scanner.next().toLowerCase();
                        flag = false;
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
                                numberOfDays = m.getDays();
                            }
                        }
                        for (Month m : months) {
                            if (m.getDays() > numberOfDays) {
                                System.out.println(m.getName());
                                flag = true;
                            }

                        }
                        if (!flag) {
                            System.out.println("There are no months with larger number of days");
                        }
                        break;

                    case 6:
                        System.out.println("Enter month...");
                        month = scanner.next().toLowerCase();
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
                                seasonName = m.getSeason();
                                for(String season : seasons) {
                                    if (seasonName.equals(season)){
                                        indexSeason=seasons.indexOf(season);
                                        if (indexSeason >= seasons.size() - 1) {
                                            System.out.println(seasons.get(0));
                                        } else {
                                            System.out.println(seasons.get(indexSeason+1));
                                        }
                                    }

                                }

                            }

                        }


                    case 7:
                        System.out.println("Enter month...");
                        month = scanner.next().toLowerCase();
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
                                seasonName = m.getSeason();
                                // for cases when new index can go outside array

                                for(String season : seasons) {
                                    if (seasonName.equals(season)){
                                        indexSeason=seasons.indexOf(season);
                                        if (indexSeason==0) {
                                            System.out.println(seasons.get(seasons.size()-1));
                                        } else {
                                            System.out.println(seasons.get(indexSeason-1));
                                        }
                                    }

                                }
                            }
                        }
                        break;

                    case 8:
                        for (Month m : months) {
                            if (m.getDays() % 2 == 0) {
                                System.out.println(m.getName());
                            }
                        }
                        break;

                    case 9:
                        for (Month m : months) {
                            if (m.getDays() % 2 != 0) {
                                System.out.println(m.getName());
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Enter month...");
                        month = scanner.next().toLowerCase();
                        flag = false;
                        for (Month m : months) {
                            if (m.getName().toLowerCase().equals(month)) {
                                if (m.getDays() % 2 == 0) {
                                    System.out.println("Month has even number of days");
                                    flag = true;
                                }
                            }
                        }
                        if (!flag) {
                            System.out.println("Month does not have even number of days");
                        }
                        break;
                    default:
                        System.out.println("Something went wrong!The numbers must be 0-9");
                }
                //catch block to check the exception if user enters values that are not integers
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }










