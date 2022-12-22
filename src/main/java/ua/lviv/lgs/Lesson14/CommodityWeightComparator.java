package ua.lviv.lgs.Lesson14;

import java.util.Comparator;

public class CommodityWeightComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity c1, Commodity c2) {
        return Integer.compare(c1.getWeight(), c2.getWeight());
    }
}
