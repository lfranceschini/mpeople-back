package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.repositorie.PoleRepository;
import com.micropole.mpeople.core.entity.Pole;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
@Component("poleService")
public class PoleServiceImpl implements MpeopleService<Pole> {

    @Autowired
    private PoleRepository poleRepository;

    @Override
    public List<Pole> getAll() {
        return (List<Pole>) poleRepository.findAll();
    }

    @Override
    public Pole getOneById(int id) {
        return poleRepository.findOne(id);
    }
}
