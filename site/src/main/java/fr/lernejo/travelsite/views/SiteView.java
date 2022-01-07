package fr.lernejo.travelsite.views;

import fr.lernejo.travelsite.models.Destination;
import fr.lernejo.travelsite.models.Traveler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SiteView {
    private final List<Destination> destinations = new ArrayList<>();
    private final List <Traveler> travelers = new ArrayList<>();

    //Inscription
    public void inscription(Traveler traveler){
        travelers.add(traveler);
    }

    //travels
    public List<Destination> getDestination(String userName){
        return this.destinations;
    }
}
