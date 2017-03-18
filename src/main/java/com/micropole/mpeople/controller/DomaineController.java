package com.micropole.mpeople.controller;

import com.micropole.mpeople.entities.DomaineEntity;
import com.micropole.mpeople.entities.PoleEntity;
import com.micropole.mpeople.service.DomaineService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private DomaineService domaineService;

    @RequestMapping(value = "/getAllDomaines", produces = "application/json")
    public List<DomaineEntity> getAllDomaines(){
        return domaineService.getAllDomaines();
    }

    @RequestMapping(value = "/getDomaineById/{idPole}", produces = "application/json")
    public DomaineEntity getDomaineById(@PathVariable int idPole){
        return domaineService.getDomaineById(idPole);
    }

}
