package br.com.alura.mymusic.model;

public class Music extends Audio {

    private String singer;
    private String album;
    private String gender;

    public Music(String title, Integer duration, String singer, String album, String gender) {
        super(title, duration);
        this.singer = singer;
        this.album = album;
        this.gender = gender;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public Integer getClassification() {
        if (this.totalPlays > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}