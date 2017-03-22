package com.micropole.mpeople.dao.impl;


import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

import com.micropole.mpeople.dao.CollaborateurDao;
import com.micropole.mpeople.core.entity.Collaborateur;
import org.springframework.stereotype.Component;

/**
 * Created by lfranceschini on 10/03/2017.
 */
@Component
public class CollaborateurDaoImpl implements CollaborateurDao{

    private static final String PERSISTENCE_UNIT_NAME = "mpeople";
    private static final String GET_COLLABORATEURS = "select c from Collaborateur c where c.matricule = :matricule and c.nom = :nom and c.prenom = :prenom";

    @Override
    public List<Collaborateur> getCollaborateurByMutliCritere(Collaborateur collaborateur) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        //CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();

        CriteriaQuery<Collaborateur> q = criteriaBuilder.createQuery(Collaborateur.class);
        Root<Collaborateur> c = q.from(Collaborateur.class);

        //Construction d'une liste de parametres
        List<Predicate> predicates = new ArrayList<Predicate>();

        if(collaborateur.getMatricule() != null){
            predicates.add(criteriaBuilder.equal(c.get("matricule"), collaborateur.getMatricule()));
        }

        if(collaborateur.getNom() != null){
            predicates.add(criteriaBuilder.equal(c.get("nom"), collaborateur.getNom()));
        }

        q.select(c).where(predicates.toArray(new Predicate[predicates.size()]));

        List<Collaborateur> collaborateurs = entityManager.createQuery(q).getResultList();

        return collaborateurs;
    }
}
