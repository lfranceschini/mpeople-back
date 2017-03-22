package com.micropole.mpeople.controller;

import com.micropole.mpeople.core.entity.Domaine;
import com.micropole.mpeople.core.entity.Domaine;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@RestController
@RequestMapping(value = "/domaine")
public class DomaineController {

    @Autowired
    @Qualifier(value = "domaineService")
    private MpeopleService domaineService;

    @RequestMapping(value = "/getAllDomaines", produces = "application/json")
    public List<Domaine> getAllDomaines(){
        return domaineService.getAll();
    }

    @RequestMapping(value = "/getDomaineById/{idDomaine}", produces = "application/json")
    public Domaine getDomaineById(@PathVariable int idDomaine){
        return (Domaine) domaineService.getOneById(idDomaine);
    }

}
