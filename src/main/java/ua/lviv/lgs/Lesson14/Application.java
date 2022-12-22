package ua.lviv.lgs.Lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter 1 to add item");
        System.out.println("Enter 2 to remove item");
        System.out.println("Enter 3 change item");
        System.out.println("Enter 4 to sort items by name");
        System.out.println("Enter 5 to sort items by length");
        System.out.println("Enter 6 to to sort items by width");
        System.out.println("Enter 7 to sort items by weight");
        System.out.println("Enter 8 to see n-th item");
        System.out.println("Enter 9 to exit");

        CommodityList list = new CommodityList();
        list.getAvailableGoods().add(new Commodity("orange", 34, 56, 67));
        list.getAvailableGoods().add(new Commodity("green", 12, 51, 1));
        list.getAvailableGoods().add(new Commodity("pink", 6, 76, 10));
        list.getAvailableGoods().add(new Commodity("blue", 15, 48, 20));

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        switch (number) {

            case 1: {
                System.out.println("The commodity list before adding: " + list.getAvailableGoods());
                System.out.println("Enter item name, length, width, weight...");
                Scanner scanner1 = new Scanner(System.in);
                list.addCommodity(new Commodity(scanner1.nextLine(), scanner1.nextInt(), scanner1.nextInt(), scanner1.nextInt()));
                System.out.println(list.getAvailableGoods());
                break;
            }

            case 2: {
                System.out.println(list.getAvailableGoods());
                System.out.println("Enter the name of commodity to remove ...");
                Scanner scanner1 = new Scanner(System.in);
                list.removeCommodity(scanner1.nextLine());
                break;
            }

            case 3: {
                System.out.println("Enter the name of commodity to substitute");
                Scanner scanner1 = new Scanner(System.in);
                String name1 = scanner1.nextLine();
                System.out.println("Enter new commodity to set - name, length, width, weight");
                Scanner scanner2 = new Scanner(System.in);
                list.substituteCommodity(name1, new Commodity(scanner2.nextLine(), scanner2.nextInt(), scanner2.nextInt(), scanner2.nextInt()));

                break;
            }

            case 4: {
                System.out.println("The list of commodities before sorting by name: " + list.getAvailableGoods());
                CommodityNameComparator commodityNameComparator = new CommodityNameComparator();
                Collections.sort(list.getAvailableGoods(), commodityNameComparator);
                System.out.println("The list of commodities after sorting by name: " + list.getAvailableGoods());

                break;
            }

            case 5:
                System.out.println("The list of commodities before sorting by length: " + list.getAvailableGoods());
                CommodityLengthComparator commodityLengthComparator = new CommodityLengthComparator();
                Collections.sort(list.getAvailableGoods(), commodityLengthComparator);
                System.out.println("The list of commodities after sorting by length: " + list.getAvailableGoods());
                break;

            case 6: {
                System.out.println("The list of commodities before sorting by width: " + list.getAvailableGoods());
                CommodityWidthComparator commodityWidthComparator = new CommodityWidthComparator();
                Collections.sort(list.getAvailableGoods(), commodityWidthComparator);
                System.out.println("The list of commodities before sorting by width: " + list.getAvailableGoods());
                break;
            }


            case 7: {
                System.out.println("The list of commodities before sorting by weight: " + list.getAvailableGoods());
                CommodityWeightComparator commodityWeightComparator = new CommodityWeightComparator();
                Collections.sort(list.getAvailableGoods(), commodityWeightComparator);
                System.out.println("The list of commodities before sorting by weight: " + list.getAvailableGoods());
                break;
            }

            case 8: {
                System.out.println("Enter number (the item with this index will be shown)");
                Scanner scanner1 = new Scanner(System.in);
                int enteredNumber = scanner1.nextInt();
                int size = list.getAvailableGoods().size();
                if (enteredNumber < size) {
                    System.out.println(list.getAvailableGoods().get(enteredNumber));
                } else if (enteredNumber == size) {
                    System.out.println(list.getAvailableGoods().get(enteredNumber - 1));
                } else {
                    System.out.println("Sorry, there is no item with such index");
                }

                break;
            }

            case 9: {
                System.out.println("We are exiting system... Bye!");
                System.exit(0);
                break;
            }
        }
    }

}
