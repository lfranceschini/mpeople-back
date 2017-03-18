package com.micropole.mpeople.service;

import com.micropole.mpeople.entities.DomaineEntity;
import com.micropole.mpeople.entities.PosteEntity;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
public interface DomaineService {

    List<DomaineEntity> getAllDomaines();

    DomaineEntity getDomaineById(int idDomaine);

}
