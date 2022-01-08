package fr.lernejo.travelsite.models;

import fr.lernejo.travelsite.Exceptions.DestinationNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class DestinationRepository {
    private final List<Destination> destinationList;

    public DestinationRepository(){
        destinationList = new ArrayList<>();
        destinationList.add(new Destination("Espagne",32.1));
        destinationList.add(new Destination("Portugal",10.1));
    }
    public Destination findDestination(String country) throws DestinationNotFoundException {
        for (Destination destination: destinationList)
            if(destination.country().equals(country))
                return destination;
            throw new DestinationNotFoundException();
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }
}
