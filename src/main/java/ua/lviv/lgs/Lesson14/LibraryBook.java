package ua.lviv.lgs.Lesson14;

public class LibraryBook implements Comparable <LibraryBook>{
    private String name;
    private int numberOfPages;

    public LibraryBook(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return  "Name: " + getName() + " " + "Pages: " + getNumberOfPages();
    }

    public int compareTo(LibraryBook anotherBook) {
        return this.name.compareTo(anotherBook.getName());
    }
}
