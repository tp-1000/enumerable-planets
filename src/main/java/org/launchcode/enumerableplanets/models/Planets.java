package org.launchcode.enumerableplanets.models;

public enum Planets {
    MERCURY("Mercury", "88"),
    VENUS("Venus", "225"),
    EARTH("Earth", "365"),
    MARS("Mars", "687"),
    JUPITER("Jupiter", "4333"),
    SATURN("Saturn", "10759"),
    URANUS("Uranus", "30687"),
    NEPTUNE("Neptune", "60200");

    public final String displayName;
    public final String yearLength;

    Planets(String planet, String yearLength){
        this.displayName = planet;
        this.yearLength = yearLength;
    }

    public String getYearLength() {
        return yearLength;
    }

    public String getDisplayName() {
        return displayName;
    }
}
