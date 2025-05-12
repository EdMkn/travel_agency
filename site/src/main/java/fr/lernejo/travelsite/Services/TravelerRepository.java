package fr.lernejo.travelsite.Services;

import java.util.ArrayList;
import java.util.List;

import fr.lernejo.travelsite.Exceptions.TravelerNotFoundException;
import fr.lernejo.travelsite.models.Traveler;
/**
 * A class That can record travelers and get a list of them.
 */
public class TravelerRepository {
    private final List<Traveler> travelerList;

    public TravelerRepository(){
        travelerList = new ArrayList<>();
    }
    public void recordTraveler(Traveler traveler){
        travelerList.add(traveler);
    }
    List<Traveler> getTravelerList(){return travelerList;}
    public Traveler findTraveler(String userName){
        for(Traveler traveler : travelerList)
            if(traveler.userName().equals(userName))
                return traveler;
            throw new TravelerNotFoundException();
    }
}
