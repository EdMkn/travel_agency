package fr.lernejo.travelsite.models;

import java.util.Date;
import java.util.List;

public record Temperature_Land (String country, List<TemperatureDate> temperatures){

}

