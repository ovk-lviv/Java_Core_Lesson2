package ua.lviv.lgs.Lesson14;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity c1, Commodity c2) {
        return Integer.compare(c1.getLength(), c2.getLength());
    }
}
