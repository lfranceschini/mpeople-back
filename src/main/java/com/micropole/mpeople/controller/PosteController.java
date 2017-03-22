package com.micropole.mpeople.controller;

import com.micropole.mpeople.core.entity.Poste;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */

@RestController
@RequestMapping(value = "/poste")
public class PosteController {

    @Autowired
    @Qualifier("posteService")
    private MpeopleService posteService;

    @RequestMapping(value = "/getAllPostes", produces = "application/json")
    public List<Poste> getAllPostes(){
        return posteService.getAll();
    }

    @RequestMapping(value = "/getPosteById/{idPoste}", produces = "application/json")
    public Poste getPosteById(@PathVariable int idPoste){
        return (Poste) posteService.getOneById(idPoste);
    }

}
