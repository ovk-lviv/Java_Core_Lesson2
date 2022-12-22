package ua.lviv.lgs.Lesson14;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity c1, Commodity c2) {
        return Integer.compare(c1.getWidth(), c2.getWidth());
    }
}
