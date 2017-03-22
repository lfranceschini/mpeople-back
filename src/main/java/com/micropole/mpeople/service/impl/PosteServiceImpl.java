package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.core.entity.Poste;
import com.micropole.mpeople.repositorie.PosteRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
@Component("posteService")
public class PosteServiceImpl implements MpeopleService<Poste> {

    @Autowired
    private PosteRepository posteRepository;

    @Override
    public List<Poste> getAll() {
        return (List<Poste>) posteRepository.findAll();
    }

    @Override
    public Poste getOneById(int id) {
        return posteRepository.findOne(id);
    }
}
