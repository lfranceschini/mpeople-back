package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.entities.PosteEntity;
import com.micropole.mpeople.repositories.PosteRepository;
import com.micropole.mpeople.service.PosteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
@Component
public class PosteServiceImpl implements PosteService {

    @Autowired
    private PosteRepository posteRepository;

    @Override
    public List<PosteEntity> getAllPostes() {
        return (List<PosteEntity>) posteRepository.findAll();
    }

    @Override
    public PosteEntity getPosteById(int idPoste) {
        return posteRepository.findOne(idPoste);
    }
}
