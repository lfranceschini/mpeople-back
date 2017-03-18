package com.micropole.mpeople.mapper;

import com.micropole.mpeople.dto.CollaborateurDTO;
import com.micropole.mpeople.entities.Collaborateur;
import com.micropole.mpeople.entities.PoleEntity;

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
