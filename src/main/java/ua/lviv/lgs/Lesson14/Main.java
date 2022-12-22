package ua.lviv.lgs.Lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<LibraryBook> books = new ArrayList<>();
       BookNameComparator nameComparator = new BookNameComparator();
       BookPagesComparator pagesComparator = new BookPagesComparator();

       books.add(new LibraryBook("Catcher in the Rye", 100));
       books.add(new LibraryBook("Jane Eyre", 456));
       books.add(new LibraryBook("Adventures of Sherlock Holmes", 325));
       books.add(new LibraryBook("450 Fahrenheit", 393));
       books.add(new LibraryBook("To Kill a Mockingbird", 278));
       books.add(new LibraryBook("The Shining", 502));

        System.out.println("Before sorting: " + books.toString());
        Collections.sort(books,nameComparator);

        System.out.println("Sort by name: " + books.toString());

        Collections.sort(books, pagesComparator);
        System.out.println("Sort by pages: " + books.toString());

    }
}
