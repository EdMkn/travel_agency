package fr.lernejo.travelsite.controllers;

import fr.lernejo.travelsite.models.Destination;
import fr.lernejo.travelsite.views.SiteView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DestinationController {
    private final SiteView siteView;

    public DestinationController(SiteView siteView){
        this.siteView = siteView;
    }
    @ResponseBody
    @GetMapping(path = "/api/travels")
    public List<Destination> destinations(@RequestParam String userName){
        return siteView.getDestination(userName);
    }

}
