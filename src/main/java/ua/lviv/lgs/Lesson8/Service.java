/**
 *
 */
package ua.lviv.lgs.Lesson8;

/**
 * class Service contains enums with seasons and months' names
 * @author okovalska
 * @since JDK1.0
 */

public class Service {
    /** Enumeration with seasons, presented in natural order*/
    enum Seasons {
        WINTER, SPRING, SUMMER, FALL
    }
    /** Enumeration with months, presented in natural order*/
    enum Months {
        JANUARY(31, Seasons.WINTER),
        FEBRUARY(28, Seasons.WINTER),
        MARCH(31, Seasons.SPRING),
        APRIL(30, Seasons.SPRING),
        MAY (31, Seasons.SPRING),
        JUNE(30, Seasons.SUMMER),
        JULY(31, Seasons.SUMMER),
        AUGUST(31, Seasons.SUMMER),
        SEPTEMBER(30, Seasons.FALL),
        OCTOBER(31, Seasons.FALL),
        NOVEMBER(30, Seasons.FALL),
        DECEMBER(31, Seasons.WINTER);

        /**represents the number of days in month*/
        int days;

        /**represents the season a month belongs to*/
        Seasons season;

        /**
         * creates an object with number of days and season attribute
         * @param days
         * @param season
         */
        Months (int days, Seasons season) {
            this.days=days;
            this.season=season;
        }

        /**@return the number of days in month*/
        public int getDays() {
            return days;
        }

        /**@return the season of the month*/
        public Seasons getSeason() {
            return season;
        }
    }

    /**displays a list of options that user can pick*/
    public static void menu() {
        System.out.println("Enter 1 to see if month exists");
        System.out.println("Enter 2 to see months of the same season");
        System.out.println("Enter 3 to to see months with the same number of days");
        System.out.println("Enter 4 to see months with fewer number of days");
        System.out.println("Enter 5 to see months with larger number of days");
        System.out.println("Enter 6 to see the next season");
        System.out.println("Enter 7 to see the previous season");
        System.out.println("Enter 8 to see months with even number of days");
        System.out.println("Enter 9 to see months with odd number of days");
        System.out.println("Enter 0 to see if month has even number of days");
    }

}
