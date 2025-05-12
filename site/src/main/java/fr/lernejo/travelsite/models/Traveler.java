package fr.lernejo.travelsite.models;
/**
 * A class representing a Traveler.
 * The record class is made so the constructor, the getters, equals(), hashCode(, and toString() are automatically generated
 * @param userEmail the email of the user
 * @param userName the name of the user
 * @param userCountry their country
 * @param weatherExpectation their expectation whether the temperature of the country destination is hotter or colder
 * @param minimumTemperatureDistance the minimum amount of temperature difference between the 2 countries
 */
public record Traveler(String userEmail, String userName, String userCountry, WeatherExpectation weatherExpectation,double minimumTemperatureDistance) {

}
