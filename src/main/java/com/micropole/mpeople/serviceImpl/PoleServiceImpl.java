package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.repositories.PoleRepository;
import com.micropole.mpeople.entities.PoleEntity;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
@Component("poleService")
public class PoleServiceImpl implements MpeopleService<PoleEntity> {

    @Autowired
    private PoleRepository poleRepository;

    @Override
    public List<PoleEntity> getAll() {
        return (List<PoleEntity>) poleRepository.findAll();
    }

    @Override
    public PoleEntity getOneById(int id) {
        return poleRepository.findOne(id);
    }
}
