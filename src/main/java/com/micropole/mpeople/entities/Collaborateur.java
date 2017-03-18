package com.micropole.mpeople.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by lfranceschini on 07/03/2017.
 */
@Entity
public class Collaborateur implements Serializable {

    @Id
    private String matricule;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private Date date_arrivee;
    private String email;
    private String login;
    private String mot_de_passe;
    private Date date_sortie;
    //Relation bidirectionnelle avec l'objet poste
    @ManyToOne
    @JoinColumn(name = "tv_poste_id")
    @JsonManagedReference
    private PosteEntity posteEntity;
    //Relation bidirectionnelle avec l'objet pole
    @ManyToOne
    @JoinColumn(name = "tv_pole_id")
    @JsonManagedReference
    private PoleEntity poleEntity;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }


    public PosteEntity getPosteEntity() {
        return posteEntity;
    }

    public void setPosteEntity(PosteEntity posteEntity) {
        this.posteEntity = posteEntity;
    }

    public Date getDate_sortie() {
        return date_sortie;
    }

    public void setDate_sortie(Date date_sortie) {
        this.date_sortie = date_sortie;
    }

    public PoleEntity getPoleEntity() {
        return poleEntity;
    }

    public void setPoleEntity(PoleEntity poleEntity) {
        this.poleEntity = poleEntity;
    }

    @Override
    public String toString() {
        return "Collaborateur{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissance=" + date_naissance +
                ", date_arrivee=" + date_arrivee +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                ", date_sortie=" + date_sortie +
                ", poste=" + posteEntity +
                '}';
    }
}
