package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.core.entity.RendezVous;
import com.micropole.mpeople.repositorie.RendezVousRepository;
import com.micropole.mpeople.service.MpeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 22/03/2017.
 */
@Component("rendezVousService")
public class RendezVousServiceImpl implements MpeopleService<RendezVous>{

    @Autowired
    private RendezVousRepository rendezVousRepository;

    @Override
    public List<RendezVous> getAll() {
        return (List<RendezVous>)rendezVousRepository.findAll();
    }

    @Override
    public RendezVous getOneById(int id) {
        return rendezVousRepository.findOne(id);
    }
}
