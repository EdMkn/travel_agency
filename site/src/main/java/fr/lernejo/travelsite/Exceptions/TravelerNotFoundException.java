package fr.lernejo.travelsite.Exceptions;

import fr.lernejo.travelsite.models.Traveler;

public class TravelerNotFoundException extends Throwable {
    public TravelerNotFoundException(){
        System.out.println("voyageur non present");
    }
}
