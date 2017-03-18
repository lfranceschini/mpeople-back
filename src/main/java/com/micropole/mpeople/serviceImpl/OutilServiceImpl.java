package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.entities.OutilEntity;
import com.micropole.mpeople.repositories.OutilRepository;
import com.micropole.mpeople.service.OutilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Component
public class OutilServiceImpl implements OutilService {

    @Autowired
    private OutilRepository outilRepository;

    @Override
    public List<OutilEntity> getAllOutils() {
        return (List<OutilEntity>) outilRepository.findAll();
    }

    @Override
    public OutilEntity getOutilById(int idOutil) {
        return outilRepository.findOne(idOutil);
    }
}
