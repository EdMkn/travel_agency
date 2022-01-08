package fr.lernejo.travelsite.controllers;

import fr.lernejo.travelsite.Exceptions.TravelerNotFoundException;
import fr.lernejo.travelsite.models.Destination;
import fr.lernejo.travelsite.Services.DestinationRepository;
import fr.lernejo.travelsite.models.Traveler;
import fr.lernejo.travelsite.Services.TravelerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api")
@RestController
public class TravelSiteController {

    private final TravelerRepository travelerRepository = new TravelerRepository();
    private final DestinationRepository destinationRepository = new DestinationRepository();
    public TravelSiteController() {
    }
        @PostMapping(path = "/inscription")
    public void inscription(@RequestBody Traveler traveler){
        travelerRepository.recordTraveler(traveler);
    }
    @ResponseBody
    @GetMapping(path = "/travels")
    public List<Destination> destinationsForTraveler(@RequestParam String userName) throws TravelerNotFoundException {
        //destinationList pour le moment on s'en occupe plus tard
         List<Destination> destinationList = destinationRepository.getDestinationList();

        Traveler traveler = travelerRepository.findTraveler(userName);
        return destinationList;
    }


}
