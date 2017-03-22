package com.micropole.mpeople.controller;

import com.micropole.mpeople.core.entity.Client;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    @Qualifier("clientService")
    private MpeopleService clientService;

    @RequestMapping(value = "/getAllClients", produces = "application/json")
    public List<Client> getAllClients(){
        return clientService.getAll();
    }

    @RequestMapping(value = "/getClientById/{idClient}", produces = "application/json")
    public Client getClientById(@PathVariable int idClient){
        return (Client) clientService.getOneById(idClient);
    }

}
