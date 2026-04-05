package br.com.alura.mymusic.model;

public class Audio {

    protected String title;
    protected Integer duration;
    protected Integer totalPlays = 0;
    protected Integer likes = 0;
    protected Integer classification;

    public Audio(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getTotalPlays() {
        return totalPlays;
    }

    public Integer getLikes() {
        return likes;
    }

    public Integer getClassification() {
        return classification;
    }

    public void toEnjoy() {
        likes++;
    }

    public void play() {
        totalPlays++;
    }
}