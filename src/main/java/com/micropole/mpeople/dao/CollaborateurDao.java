package com.micropole.mpeople.dao;

import com.micropole.mpeople.core.entity.Collaborateur;

import java.util.List;

/**
 * Created by lfranceschini on 08/03/2017.
 */
public interface CollaborateurDao {

    List<Collaborateur> getCollaborateurByMutliCritere(Collaborateur collaborateur);

}
