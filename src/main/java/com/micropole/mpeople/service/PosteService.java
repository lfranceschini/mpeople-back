package com.micropole.mpeople.service;

import com.micropole.mpeople.entities.PosteEntity;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
public interface PosteService {

    List<PosteEntity> getAllPostes();

    PosteEntity getPosteById(int idPoste);

}
