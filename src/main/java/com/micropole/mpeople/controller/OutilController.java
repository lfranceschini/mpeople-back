package com.micropole.mpeople.controller;

import com.micropole.mpeople.core.entity.Outil;
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
@RequestMapping(value = "/outil")
public class OutilController {

    @Autowired
    @Qualifier(value = "outilService")
    private MpeopleService outilService;

    @RequestMapping(value = "/getAllOutils", produces = "application/json")
    public List<Outil> getAllOutils(){
        return outilService.getAll();
    }

    @RequestMapping(value = "/getOutilById/{idOutil}", produces = "application/json")
    public Outil getOutilById(@PathVariable int idOutil){
        return (Outil) outilService.getOneById(idOutil);
    }

}
