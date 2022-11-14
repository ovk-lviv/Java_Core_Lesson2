package ua.lviv.lgs.Lesson12.reworkEnaums;

public class Month {
    private String name;
    private int days;
    private String season;


    Month (String name, int days, String season) {
        this.days = days;
        this.name = name;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getSeason() {
        return season;
    }
}
