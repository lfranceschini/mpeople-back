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
 * Created by lfranceschini on 19/03/2017.
 */
@RestController
@RequestMapping(value = "methodo")
public class MethodoController {

    @Autowired
    @Qualifier(value = "methodoService")
    private MpeopleService methodoService;

    @RequestMapping(value = "/getAllMethodos", produces = "application/json")
    public List<Outil> getAllMeyhodo(){
        return methodoService.getAll();
    }

    @RequestMapping(value = "/getMethodoById/{idMethodo}", produces = "application/json")
    public Outil getMethodoById(@PathVariable int idMethodo){
        return (Outil) methodoService.getOneById(idMethodo);
    }

}
