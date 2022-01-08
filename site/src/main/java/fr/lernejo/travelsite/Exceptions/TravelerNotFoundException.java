package fr.lernejo.travelsite.Exceptions;

import fr.lernejo.travelsite.models.Traveler;

public class TravelerNotFoundException extends RuntimeException {
    public TravelerNotFoundException(){
        super("voyageur non present");
    }
}
