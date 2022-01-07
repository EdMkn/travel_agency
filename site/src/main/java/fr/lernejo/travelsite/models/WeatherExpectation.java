package fr.lernejo.travelsite.models;

public enum WeatherExpectation {
    WARMER("WARMER"),
    COLDER("COLDER");
    public final String theweather;

    WeatherExpectation(String weather){
        theweather = weather;
    }
}
