package com.micropole.mpeople.service;

import com.micropole.mpeople.dto.CollaborateurDTO;
import com.micropole.mpeople.entities.Collaborateur;
import java.util.List;

/**
 * Created by lfranceschini on 08/03/2017.
 */
public interface CollaborateurService {

    List<Collaborateur> getAllCollaborateurs();

    List<Collaborateur> getCollaborateurByMutliCritere(CollaborateurDTO collaborateurDTO);

    Collaborateur getCollaborateurByMatricule(String matricule);

}
