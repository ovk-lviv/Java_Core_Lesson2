package ua.lviv.lgs.Lesson17;

public class Main {
    public static void main(String[] args) {
        int [] test = new int[]{2, 5, 4, -9, 0, 34};
        int [] test1 = new int[]{2, 5, 4, -9, 0, 34, 78, 3, 5, 101};

        Collection c = new Collection(test);
        Collection.Order o = c.new Order();
        o.hasNext();
        o.next();

        Collection c1 = new Collection(test1);
        Collection.ReverseOrder ro = c1.new ReverseOrder();
        ro.next();


    }
}
