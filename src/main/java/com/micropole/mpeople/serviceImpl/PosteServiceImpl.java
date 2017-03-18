package com.micropole.mpeople.serviceImpl;

import com.micropole.mpeople.entities.PosteEntity;
import com.micropole.mpeople.repositories.PosteRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
@Component("posteService")
public class PosteServiceImpl implements MpeopleService<PosteEntity> {

    @Autowired
    private PosteRepository posteRepository;

    @Override
    public List<PosteEntity> getAll() {
        return (List<PosteEntity>) posteRepository.findAll();
    }

    @Override
    public PosteEntity getOneById(int id) {
        return posteRepository.findOne(id);
    }
}
