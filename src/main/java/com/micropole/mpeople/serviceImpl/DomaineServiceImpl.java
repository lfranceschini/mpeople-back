package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.entities.DomaineEntity;
import com.micropole.mpeople.repositories.DomaineRepository;
import com.micropole.mpeople.service.DomaineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Component
public class DomaineServiceImpl implements DomaineService {

    @Autowired
    private DomaineRepository domaineRepository;

    @Override
    public List<DomaineEntity> getAllDomaines() {
        return (List<DomaineEntity>) domaineRepository.findAll();
    }

    @Override
    public DomaineEntity getDomaineById(int idDomaine) {
        return domaineRepository.findOne(idDomaine);
    }
}
