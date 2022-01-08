package fr.lernejo.travelsite.models;

import java.util.Date;

public record Temperature_Land (String country, Date date, double temperature){
    
    @Override
    public String toString(){
        return temperature + "°C"+ date +"at"+country;
    }
}

