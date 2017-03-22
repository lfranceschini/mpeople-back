package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.core.entity.Langage;
import com.micropole.mpeople.repositorie.LangageRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 18/03/2017.
 */
@Component("langageService")
public class LangageServiceImpl implements MpeopleService<Langage> {

    @Autowired
    private LangageRepository langageRepository;

    @Override
    public List<Langage> getAll() {
        return (List<Langage>)langageRepository.findAll();
    }

    @Override
    public Langage getOneById(int id) {
        return langageRepository.findOne(id);
    }
}
