package io.codefountain.jackson.demo1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Arrays;
import java.util.Date;

public class SerializationMain {

    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        Artist artist = new Artist();
        artist.setName("Arijit");
        artist.setInstruments("Violin", "Excellent");


        Album album = new Album();
        album.setName("Blue Whale");
        album.setLinks(new String[]{"Link1", "Link2"});
        album.setSongs(Arrays.asList("Song1", "Song2", "Song3"));
        album.setReleaseDate(new Date());
        album.setArtist(new Artist[]{artist});

        objectMapper.writeValue(System.out, album);

    }
}
