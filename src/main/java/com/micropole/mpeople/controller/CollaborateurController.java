package com.micropole.mpeople.controller;

import com.micropole.mpeople.core.dto.CollaborateurDTO;
import com.micropole.mpeople.core.entity.Collaborateur;
import com.micropole.mpeople.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lfranceschini on 06/03/2017.
 */
@RestController
@RequestMapping(value = "/collaborateur")
public class CollaborateurController {

    @Autowired
    private CollaborateurService collaborateurService;

    @RequestMapping(method = RequestMethod.POST, value = "/getCollaborateurs", produces = "application/json", consumes = "application/json")
    public Collaborateur getCollaborateurByMatricule(@RequestBody CollaborateurDTO collaborateur){
        List<Collaborateur> test = collaborateurService.getCollaborateurByMutliCritere(collaborateur);
        return test.get(0);
    }

}
