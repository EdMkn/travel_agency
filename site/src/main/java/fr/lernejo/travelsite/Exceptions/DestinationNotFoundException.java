package fr.lernejo.travelsite.Exceptions;

public class DestinationNotFoundException extends RuntimeException {
    public DestinationNotFoundException(){
        System.out.println("destination non desservie");
    }
}
