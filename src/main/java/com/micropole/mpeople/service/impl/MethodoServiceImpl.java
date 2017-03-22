package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.core.entity.Methodo;
import com.micropole.mpeople.repositorie.MethodoRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 19/03/2017.
 */
@Component("methodoService")
public class MethodoServiceImpl implements MpeopleService<Methodo> {

    @Autowired
    private MethodoRepository methodoRepository;

    @Override
    public List<Methodo> getAll() {
        return (List<Methodo>) methodoRepository.findAll();
    }

    @Override
    public Methodo getOneById(int id) {
        return methodoRepository.findOne(id);
    }
}
