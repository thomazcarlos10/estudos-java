package br.com.alura.screenmatch.model;

public class Series extends Title {

    private Integer seasons;
    private Integer episodesPerSeason;
    private Boolean active;
    private Integer minutesPerEpisode;

    public Series(String name, Integer releaseYear, Integer seasons, Integer episodesPerSeason, Boolean active, Integer minutesPerEpisode) {
        super(name, releaseYear);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.active = active;
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Integer getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(Integer episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(Integer minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public Integer getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + getName() + ", Ano de lançamento: " + getReleaseYear() + ", Seasons: " + seasons + ", Episodes per season: " + episodesPerSeason + ", Active: " + active;
    }
}