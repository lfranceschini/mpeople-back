package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.core.entity.Domaine;
import com.micropole.mpeople.repositorie.DomaineRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Component("domaineService")
public class DomaineServiceImpl implements MpeopleService<Domaine> {

    @Autowired
    private DomaineRepository domaineRepository;

    @Override
    public List<Domaine> getAll() {
        return (List<Domaine>) domaineRepository.findAll();
    }

    @Override
    public Domaine getOneById(int id) {
        return domaineRepository.findOne(id);
    }
}
