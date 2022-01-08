package fr.lernejo.travelsite.Services;

import fr.lernejo.travelsite.Exceptions.DestinationNotFoundException;
import fr.lernejo.travelsite.models.Destination;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DestinationRepository {
    private final List<Destination> destinationList;
    private final TemperatureService temperatureService;

    public DestinationRepository(){
        destinationList = new ArrayList<>();
        temperatureService= new TemperatureService();

        for(String country:temperatureService.getCountries()){
            destinationList.add(new Destination(country,temperatureService.getAvgTemperature(country)));
        }
    }
    public Destination findDestination(String country) {
        for (Destination destination: destinationList)
            if(destination.country().equals(country))
                return destination;
            throw new DestinationNotFoundException();
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }
}
