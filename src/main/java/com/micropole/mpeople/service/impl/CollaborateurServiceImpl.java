package com.micropole.mpeople.service.impl;

import com.micropole.mpeople.dao.CollaborateurDao;
import com.micropole.mpeople.core.dto.CollaborateurDTO;
import com.micropole.mpeople.core.entity.Collaborateur;
import com.micropole.mpeople.mapper.CollaborateurMapper;
import com.micropole.mpeople.service.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lfranceschini on 08/03/2017.
 */
@Component
public class CollaborateurServiceImpl implements CollaborateurService{

    @Autowired
    private CollaborateurDao collaborateurDao;

    @Override
    public List<Collaborateur> getAllCollaborateurs() {
        return null;
    }

    @Override
    public List<Collaborateur> getCollaborateurByMutliCritere(CollaborateurDTO collaborateurDTO) {
        Collaborateur collaborateur = CollaborateurMapper.getCollaborateurFromCollaborateurDTO(collaborateurDTO);
        return collaborateurDao.getCollaborateurByMutliCritere(collaborateur);
    }

    @Override
    public Collaborateur getCollaborateurByMatricule(String matricule) {
        return null;
    }
}
