package br.com.alura.mymusic.model;

public class Podcast extends Audio {

    private String presenterName;
    private String description;

    public Podcast(String title, Integer duration, String presenterName, String description) {
        super(title, duration);
        this.presenterName = presenterName;
        this.description = description;
    }

    public String getPresenterName() {
        return presenterName;
    }

    public void setPresenterName(String presenterName) {
        this.presenterName = presenterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Integer getClassification() {
        if (this.likes > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}