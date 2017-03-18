package com.micropole.mpeople.controller;

import com.micropole.mpeople.entities.DomaineEntity;
import com.micropole.mpeople.entities.OutilEntity;
import com.micropole.mpeople.service.DomaineService;
import com.micropole.mpeople.service.OutilService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private OutilService outilService;

    @RequestMapping(value = "/getAllOutils", produces = "application/json")
    public List<OutilEntity> getAllOutils(){
        return outilService.getAllOutils();
    }

    @RequestMapping(value = "/getOutilById/{idOutil}", produces = "application/json")
    public OutilEntity getOutilById(@PathVariable int idOutil){
        return outilService.getOutilById(idOutil);
    }

}
