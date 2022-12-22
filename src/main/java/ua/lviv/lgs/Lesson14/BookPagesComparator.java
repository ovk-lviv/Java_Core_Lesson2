package ua.lviv.lgs.Lesson14;

import java.util.Comparator;

public class BookPagesComparator implements Comparator<LibraryBook> {
    @Override
    public int compare(LibraryBook o1, LibraryBook o2) {
        return Integer.compare(o1.getNumberOfPages(), o2.getNumberOfPages());
    }
}
