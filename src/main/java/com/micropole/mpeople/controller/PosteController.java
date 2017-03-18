package com.micropole.mpeople.controller;

import com.micropole.mpeople.entities.PosteEntity;
import com.micropole.mpeople.service.PosteService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private PosteService posteService;

    @RequestMapping(value = "/getAllPostes", produces = "application/json")
    public List<PosteEntity> getAllPostes(){
        return posteService.getAllPostes();
    }

    @RequestMapping(value = "/getPosteById/{idPoste}", produces = "application/json")
    public PosteEntity getPosteById(@PathVariable int idPoste){
        return posteService.getPosteById(idPoste);
    }

}