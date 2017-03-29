package com.micropole.mpeople.controller;

import com.micropole.mpeople.core.entity.Domaine;
import com.micropole.mpeople.core.entity.Domaine;
import com.micropole.mpeople.exception.NoDataFoundException;
import com.micropole.mpeople.service.MpeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger LOGGER = LoggerFactory.getLogger(DomaineController.class);

    @RequestMapping(value = "/getAllDomaines", produces = "application/json")
    public List<Domaine> getAllDomaines(){
        return domaineService.getAll();
    }

    @RequestMapping(value = "/getDomaineById/{idDomaine}", produces = "application/json")
    public Domaine getDomaineById(@PathVariable int idDomaine){
        Domaine domaine = null;

            domaine = (Domaine) domaineService.getOneById(idDomaine);

        return domaine;
    }

}
