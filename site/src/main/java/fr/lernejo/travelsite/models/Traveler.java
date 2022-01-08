package fr.lernejo.travelsite.models;

public record Traveler(String userEmail, String userName, String userCountry, WeatherExpectation weatherExpectation,double minimumTemperatureDistance) {

}
