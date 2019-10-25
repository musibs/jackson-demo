package io.codefountain.jackson.demo1;

import java.util.Date;
import java.util.List;

public class Album {

    private String name;
    private String[] links;
    private List<String> songs;
    private Date releaseDate;

    public Artist[] getArtist() {
        return artist;
    }

    public void setArtist(Artist[] artist) {
        this.artist = artist;
    }

    private Artist[] artist;

    public String[] getLinks() {
        return links;
    }

    public void setLinks(String[] links) {
        this.links = links;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
