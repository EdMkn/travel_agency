package fr.lernejo.travelsite.models;

import fr.lernejo.travelsite.Exceptions.TravelerNotFoundException;
import fr.lernejo.travelsite.models.Traveler;

import java.util.ArrayList;
import java.util.List;

public class TravelerRepository {
    public final List<Traveler> travelerList;

    public TravelerRepository(){
        travelerList = new ArrayList<>();
    }
    public void recordTraveler(Traveler traveler){
        travelerList.add(traveler);
    }
    List<Traveler> getTravelerList(){return travelerList;}
    public Traveler findTraveler(String userName) throws TravelerNotFoundException {
        for(Traveler traveler : travelerList)
            if(traveler.userName().equals(userName))
                return traveler;
            throw new TravelerNotFoundException();
    }
}
