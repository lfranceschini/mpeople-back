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
 * Created by lfranceschini on 18/03/2017.
 */
@RestController
@RequestMapping(value = "/langage")
public class LangageController {

    @Autowired
    @Qualifier(value = "langageService")
    private MpeopleService langageService;

    @RequestMapping(value = "/getAllLangages", produces = "application/json")
    public List<Outil> getAllLangages(){
        return langageService.getAll();
    }

    @RequestMapping(value = "/getLangageById/{idLangage}", produces = "application/json")
    public Outil getOutilById(@PathVariable int idOutil){
        return (Outil) langageService.getOneById(idOutil);
    }

}
