package desafios.ex03;

public class Book extends Media {
    private String author;

    public Book(String title, Integer agePublication, String author) {
        super(title, agePublication);
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("\n\nCódigo: " + generateCode()
                + " | Livro: " + "\"" + title + "\""
                + " - Autor: " + author);
    }
}