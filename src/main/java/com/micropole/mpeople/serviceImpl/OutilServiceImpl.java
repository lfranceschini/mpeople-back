package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.entities.OutilEntity;
import com.micropole.mpeople.repositories.OutilRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Component("outilService")
public class OutilServiceImpl implements MpeopleService<OutilEntity> {

    @Autowired
    private OutilRepository outilRepository;

    @Override
    public List<OutilEntity> getAll() {
        return (List<OutilEntity>) outilRepository.findAll();
    }

    @Override
    public OutilEntity getOneById(int id) {
        return outilRepository.findOne(id);
    }
}
