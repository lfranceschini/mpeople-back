package com.micropole.mpeople.service;

import com.micropole.mpeople.entities.PoleEntity;

import java.util.List;

/**
 * Created by lfranceschini on 13/03/2017.
 */
public interface PoleService {

    List<PoleEntity> getAllPoles();

    PoleEntity getPoleById(int IdPole);

}
