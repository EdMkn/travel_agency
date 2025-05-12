package fr.lernejo.travelsite.models;

import java.util.List;

/**
 * A record that associates a country with a list of temperatures it has at specific days
 * @param country a country
 * @param temperatures a list of objects associating each a day to a temperature
 */
public record Temperature_Land (String country, List<TemperatureDate> temperatures){

}

