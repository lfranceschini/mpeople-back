package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.entities.DomaineEntity;
import com.micropole.mpeople.repositories.DomaineRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Component("domaineService")
public class DomaineServiceImpl implements MpeopleService<DomaineEntity> {

    @Autowired
    private DomaineRepository domaineRepository;

    @Override
    public List<DomaineEntity> getAll() {
        return (List<DomaineEntity>) domaineRepository.findAll();
    }

    @Override
    public DomaineEntity getOneById(int id) {
        return domaineRepository.findOne(id);
    }
}
