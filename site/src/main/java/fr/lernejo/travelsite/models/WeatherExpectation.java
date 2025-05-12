package fr.lernejo.travelsite.models;

/**
 * The expectation the traveler has of the destination's weather compared to the depart
 */
public enum WeatherExpectation {
    /**
     * WARMER - The country of destination is warmer
     */
    WARMER("WARMER"),
    /**
     * COLDER - The country of destination is colder
     */
    COLDER("COLDER");
    public final String theweather;

    WeatherExpectation(String weather){
        theweather = weather;
    }
}
