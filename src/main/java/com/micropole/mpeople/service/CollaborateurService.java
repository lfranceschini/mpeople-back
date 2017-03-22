package com.micropole.mpeople.service;

import com.micropole.mpeople.core.dto.CollaborateurDTO;
import com.micropole.mpeople.core.entity.Collaborateur;
import java.util.List;

/**
 * Created by lfranceschini on 08/03/2017.
 */
public interface CollaborateurService {

    List<Collaborateur> getAllCollaborateurs();

    List<Collaborateur> getCollaborateurByMutliCritere(CollaborateurDTO collaborateurDTO);

    Collaborateur getCollaborateurByMatricule(String matricule);

}
