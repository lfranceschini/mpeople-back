package com.micropole.mpeople.mapper;

import com.micropole.mpeople.core.dto.CollaborateurDTO;
import com.micropole.mpeople.core.entity.Collaborateur;
import com.micropole.mpeople.core.entity.PoleEntity;

/**
 * Created by lfranceschini on 10/03/2017.
 */
public class CollaborateurMapper {

    public static Collaborateur getCollaborateurFromCollaborateurDTO(CollaborateurDTO collaborateurDTO){

        Collaborateur collaborateur = new Collaborateur();
        collaborateur.setMatricule(collaborateurDTO.getMatricule());
        collaborateur.setNom(collaborateurDTO.getNom());
        collaborateur.setPrenom(collaborateurDTO.getPrenom());
        collaborateur.setDate_arrivee(collaborateurDTO.getDate_arrivee());
        PoleEntity pole = new PoleEntity();
        pole.setId(collaborateurDTO.getPoleId());
        collaborateur.setPoleEntity(pole);
        return collaborateur;

    }

}
