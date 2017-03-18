package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.repositories.PoleRepository;
import com.micropole.mpeople.entities.PoleEntity;
import com.micropole.mpeople.service.PoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
@Component
public class PoleServiceImpl implements PoleService {

    @Autowired
    private PoleRepository poleRepository;

    @Override
    public List<PoleEntity> getAllPoles() {
        return (List<PoleEntity>) poleRepository.findAll();
    }

    @Override
    public PoleEntity getPoleById(int IdPole) {
        return poleRepository.findOne(IdPole);
    }
}
