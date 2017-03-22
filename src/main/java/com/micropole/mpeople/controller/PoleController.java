package com.micropole.mpeople.controller;

import com.micropole.mpeople.core.entity.PoleEntity;
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
@RequestMapping(value = "/pole")
public class PoleController {

    @Autowired
    @Qualifier(value = "poleService")
    private MpeopleService poleService;

    @RequestMapping(value = "/getAllPoles", produces = "application/json")
    public List<PoleEntity> getAllPoles(){
        return poleService.getAll();
    }

    @RequestMapping(value = "/getPoleById/{idPole}", produces = "application/json")
    public PoleEntity getPoleById(@PathVariable int idPole){
        return (PoleEntity) poleService.getOneById(idPole);
    }


}
