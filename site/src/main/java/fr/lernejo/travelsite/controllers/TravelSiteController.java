package fr.lernejo.travelsite.controllers;

import fr.lernejo.travelsite.Exceptions.TravelerNotFoundException;
import fr.lernejo.travelsite.Services.TemperatureService;
import fr.lernejo.travelsite.Services.Temperature_LandRepository;
import fr.lernejo.travelsite.models.Destination;
import fr.lernejo.travelsite.Services.DestinationRepository;
import fr.lernejo.travelsite.models.Temperature_Land;
import fr.lernejo.travelsite.models.Traveler;
import fr.lernejo.travelsite.Services.TravelerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/api")
@RestController
public class TravelSiteController {

    private final TravelerRepository travelerRepository = new TravelerRepository();
    private final DestinationRepository destinationRepository = new DestinationRepository();
    private final Temperature_LandRepository temperature_landRepository = new Temperature_LandRepository();

    public TravelSiteController() {
    }

        @PostMapping(path = "/inscription")
    public void inscription(@RequestBody Traveler traveler){
        travelerRepository.recordTraveler(traveler);
    }
    @ResponseBody
    @GetMapping(path = "/travels")
    public List<Destination> destinationsForTraveler(@RequestParam String userName) {
        //destinationList pour le moment on s'en occupe plus tard
         List<Destination> destinationList = new ArrayList<>();
        Traveler traveler = travelerRepository.findTraveler(userName);
        Destination travelerCountry = destinationRepository.findDestination(traveler.userCountry());
         for(Destination dest: destinationRepository.getDestinationList() ){
             if((traveler.weatherExpectation().theweather.equals("WARMER")) &&
                (dest.temperature() >= travelerCountry.temperature() + traveler.minimumTemperatureDistance()))
                 destinationList.add(dest);
             else if ((traveler.weatherExpectation().theweather.equals("COLDER")) &&
                 (dest.temperature() <= travelerCountry.temperature() - traveler.minimumTemperatureDistance()))
                 destinationList.add(dest);

         }


        return destinationList;
    }

    @GetMapping (path="/temperatures")
    public Temperature_Land TemperaturesPerDestination(@RequestParam String country){
        return temperature_landRepository.getLastTemperatures(country);
    }
}
