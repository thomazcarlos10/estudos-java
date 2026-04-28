package ex02;

public class Book {
    public String title;
    public String author;
    public Integer pagesNumber;

    public void displayInformation() {
        System.out.printf("\"%s\" de %s com %d páginas.\n", title, author, pagesNumber);
    }
}
