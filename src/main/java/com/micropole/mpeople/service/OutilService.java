package com.micropole.mpeople.service;

import com.micropole.mpeople.entities.DomaineEntity;
import com.micropole.mpeople.entities.OutilEntity;

import java.util.List;

/**
 * Created by lfranceschini on 14/03/2017.
 */
public interface OutilService {

    List<OutilEntity> getAllOutils();

    OutilEntity getOutilById(int idOutil);

}
