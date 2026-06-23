package desafios.ex08;

public class Report implements Printable {

    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void print() {
        System.out.printf("Título: %s\nConteúdo: %s\n",
                title, content);
    }
}
