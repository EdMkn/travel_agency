package fr.lernejo.travelsite.Exceptions;

public class DestinationNotFoundException extends RuntimeException {
    public DestinationNotFoundException(){
        super("destination non desservie");
    }
}
