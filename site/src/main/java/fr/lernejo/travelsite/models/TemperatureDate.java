package fr.lernejo.travelsite.models;
/**
 * A class for associating a specific temperature to a specific date
 * @param date The date of the day
 * @param temperature the temperature at this day
 */
public record TemperatureDate(java.util.Calendar date, Double temperature) {
}
