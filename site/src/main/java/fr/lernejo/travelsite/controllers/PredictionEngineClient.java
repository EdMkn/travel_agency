package fr.lernejo.travelsite.controllers;

import fr.lernejo.travelsite.models.Destination;
import fr.lernejo.travelsite.models.Temperature_Land;
import org.springframework.context.annotation.Bean;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface PredictionEngineClient {
    @GET("/api/temperature")
    Call<List<Temperature_Land>> getlistRepos(@Path("country") String country);
}
