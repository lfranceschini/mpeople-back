package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.core.entity.Client;
import com.micropole.mpeople.repositorie.ClientRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@Component("clientService")
public class ClientServiceImpl implements MpeopleService<Client> {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return (List<Client>)clientRepository.findAll();
    }

    @Override
    public Client getOneById(int id) {
        return clientRepository.findOne(id);
    }
}
