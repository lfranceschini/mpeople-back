package com.micropole.mpeople.service.test;

import com.micropole.mpeople.dao.CollaborateurDao;
import com.micropole.mpeople.core.entity.Collaborateur;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by lfranceschini on 12/03/2017.
 */

@RunWith(SpringRunner.class)
public class CollaborateurDaoTest {

    @Autowired
    private CollaborateurDao collaborateurDao;

    @Test
    public void testGetCollaborateurByMutliCritere(){

        Collaborateur collaborateur = new Collaborateur();
        //collaborateur.setMatricule("M0001");
        collaborateur.setNom("Franceschini");


        List<Collaborateur> collaborateurs = collaborateurDao.getCollaborateurByMutliCritere(collaborateur);

        for(Collaborateur collab : collaborateurs){
            System.out.println("COLLABORATEUR : " + collab.getNom());
        }


    }

}
