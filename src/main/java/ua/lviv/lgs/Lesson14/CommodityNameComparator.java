package ua.lviv.lgs.Lesson14;

import java.util.Comparator;

public class CommodityNameComparator implements Comparator <Commodity> {

    @Override
    public int compare(Commodity c1, Commodity c2) {
        return c1.getName().compareTo(c2.getName());
    }
}
