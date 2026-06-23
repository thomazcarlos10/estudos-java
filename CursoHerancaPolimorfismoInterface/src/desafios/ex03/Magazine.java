package desafios.ex03;

public class Magazine extends Media {
    private Integer edition;

    public Magazine(String title, Integer agePublication, Integer edition) {
        super(title, agePublication);
        this.edition = edition;
    }

    public void displayInfo() {
        System.out.println("Código: " + generateCode()
                + " | Revista: " + "\"" + title + "\""
                + " - Edição: " + edition);
    }
}