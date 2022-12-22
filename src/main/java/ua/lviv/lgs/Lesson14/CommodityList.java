package ua.lviv.lgs.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class CommodityList {
    private List<Commodity> availableGoods = new ArrayList<>();


    public List<Commodity> getAvailableGoods() {
        return availableGoods;
    }

    public void addCommodity(Commodity c) {
        availableGoods.add(c);
    }

    public void removeCommodity(String name) {
        System.out.println("The list of commodities before removing: " + getAvailableGoods());
        for (Commodity c : getAvailableGoods()) {
            if (c.getName().equals(name)) {
                getAvailableGoods().remove(c);
            }
        }
        System.out.println("The list of commodities after removing: " + getAvailableGoods());
    }

    public void substituteCommodity(String name, Commodity c2) {
        System.out.println("The list of commodities before substitution: " + getAvailableGoods());
        int index=0;
        for(Commodity c:getAvailableGoods()){
            if (c.getName().equals(name)){
                index = getAvailableGoods().indexOf(c);
            }
        }
        getAvailableGoods().remove(index);
        getAvailableGoods().add(index, c2);

        System.out.println("The list of commodities after substitution: " + getAvailableGoods());
    }
}
