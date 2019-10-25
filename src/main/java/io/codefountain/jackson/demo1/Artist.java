package io.codefountain.jackson.demo1;

import java.util.HashMap;
import java.util.Map;

public class Artist {

    private String name;
    private Map<String, String> instruments = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getInstruments() {
        return instruments;
    }

    public void setInstruments(String instrumentName, String proficiency) {
        instruments.put(instrumentName, proficiency);
    }
}
