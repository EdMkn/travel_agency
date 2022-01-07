package fr.lernejo.travelsite.controllers;

import fr.lernejo.travelsite.models.Traveler;
import fr.lernejo.travelsite.views.SiteView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping(value="/api/inscription")
@RestController
public class InscriptionController {
    private final SiteView siteView;

    public InscriptionController(SiteView siteView){
        this.siteView = siteView;
    }
    @PostMapping(path = "/api/inscription")
    public void inscription(@RequestBody Traveler traveler){
        this.siteView.inscription(traveler);
    }
}
