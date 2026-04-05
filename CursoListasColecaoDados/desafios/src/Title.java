public class Title implements Comparable<Title> {

    private String name;

    public Title(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Title other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}