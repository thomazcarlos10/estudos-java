package desafios.ex03;

public class Ebook extends Media {
    private String format;

    public Ebook(String title, Integer agePublication, String format) {
        super(title, agePublication);
        this.format = format;
    }

    public void displayInfo() {
        System.out.println("Código: " + generateCode()
                + " | Ebook: " + "\"" + title + "\""
                + " - Formato: " + format);
    }
}