package ua.lviv.lgs.Lesson14;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Commodity {

    private String name;
    private int length;
    private int width;
    private int weight;


    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
        //if parameters of the commodity are inappropriate, an exception is thrown
        if (name == null||name.equals("")) {
        throw  new NullPointerException("The name cannot be null");
        }

        if (length<=0||width<=0||weight<=0){
            throw new IllegalArgumentException("The parameters of the commodity cannot be less or equal 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity: " +
                "name=" + name +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight;
    }
}
