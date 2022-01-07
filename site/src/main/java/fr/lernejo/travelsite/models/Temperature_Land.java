package fr.lernejo.travelsite.models;

import java.util.Date;

public class Temperature_Land {
    private final String country;
    private final Date date;
    private final float temperature;

    public Temperature_Land(String country, Date date, float temperature){
        this.country = country;
        this.date = date;
        this.temperature = temperature;
    }

    @Override
    public String toString(){
        return temperature + "°C"+ date +"at"+country;
    }
}

