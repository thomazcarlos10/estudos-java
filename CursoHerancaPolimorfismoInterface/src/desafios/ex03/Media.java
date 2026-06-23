package desafios.ex03;

public class Media {
    protected String title;
    protected Integer agePublication;

    public Media(String title, Integer ageOfPublication) {
        this.title = title;
        this.agePublication = ageOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Integer getAgePublication() {
        return agePublication;
    }

    public String generateCode() {
        return "LIB-" + title.substring(0, 3) + agePublication;
    }
}
