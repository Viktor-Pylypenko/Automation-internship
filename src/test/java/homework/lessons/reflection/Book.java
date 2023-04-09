package homework.lessons.reflection;

public class Book {

    private int serialNumber;
    public String name;
    public int pagesCount;
    public String author;

    public Book() {
    }

    public Book(int serialNumber, String name, int pagesCount, String author) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.pagesCount = pagesCount;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                ", pagesCount=" + pagesCount +
                ", author='" + author + '\'' +
                '}';
    }
}
