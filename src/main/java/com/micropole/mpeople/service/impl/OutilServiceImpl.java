package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.core.entity.Outil;
import com.micropole.mpeople.repositorie.OutilRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Component("outilService")
public class OutilServiceImpl implements MpeopleService<Outil> {

    @Autowired
    private OutilRepository outilRepository;

    @Override
    public List<Outil> getAll() {
        return (List<Outil>) outilRepository.findAll();
    }

    @Override
    public Outil getOneById(int id) {
        return outilRepository.findOne(id);
    }
}
