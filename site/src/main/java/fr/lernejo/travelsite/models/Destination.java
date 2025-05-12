package fr.lernejo.travelsite.models;

/**
 * A record that represents a country with its current temperature
 * @param country a country
 * @param temperature the temperature in this country
 * @see Traveler for more information on record class
 */
public record Destination(String country, double temperature) {
}
