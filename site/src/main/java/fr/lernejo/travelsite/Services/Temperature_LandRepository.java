package fr.lernejo.travelsite.Services;

import fr.lernejo.travelsite.Exceptions.DestinationNotFoundException;
import fr.lernejo.travelsite.models.TemperatureDate;
import fr.lernejo.travelsite.models.Temperature_Land;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Temperature_LandRepository {
    private final List<Temperature_Land> listTemperatureLand;
    private final TemperatureService temperatureService = new TemperatureService();

    public Temperature_LandRepository()
    {
        listTemperatureLand = new ArrayList<>();
        for (String country:temperatureService.getCountries()){
            List<TemperatureDate> tdate = new ArrayList<>(2);
            Calendar date = Calendar.getInstance();
            tdate.add(new TemperatureDate(date, temperatureService.getTemperature(country)));
            date.add(Calendar.DAY_OF_MONTH, 2);
            tdate.add(new TemperatureDate(date, temperatureService.getTemperature(country)));
            listTemperatureLand.add(new Temperature_Land(country,tdate));
        }
    }

    public Temperature_Land getLastTemperatures(String country){
        for (Temperature_Land tland:listTemperatureLand){
            if(tland.country().equals(country))
                return tland;

        }
        throw new DestinationNotFoundException();
    }
}
