package fr.lernejo.travelsite.Exceptions;

public class DestinationNotFoundException extends Throwable {
    public DestinationNotFoundException(){
        System.out.println("destination non desservie");
    }
}
