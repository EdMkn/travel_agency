package fr.lernejo.travelsite.Exceptions;

public class UnknownCountryException extends RuntimeException {
    public UnknownCountryException(String country) {
        super("Unknown country: " + country);
    }
}
