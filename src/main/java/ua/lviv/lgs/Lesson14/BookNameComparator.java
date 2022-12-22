package ua.lviv.lgs.Lesson14;

import java.util.Comparator;

public class BookNameComparator implements Comparator <LibraryBook> {

    @Override
    public int compare(LibraryBook o1, LibraryBook o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
