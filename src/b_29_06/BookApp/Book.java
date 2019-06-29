package b_29_06.BookApp;

public class Book {
    protected String name;
    protected int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
