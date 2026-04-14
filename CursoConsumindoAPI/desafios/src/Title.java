public class Title {
    private String name;
    private Integer releaseYear;

    public Title(String name, Integer releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "{Name: " + name + ", Release year: " + releaseYear + "}";
    }
}