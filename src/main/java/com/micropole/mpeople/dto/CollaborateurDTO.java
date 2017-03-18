package com.micropole.mpeople.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by lfranceschini on 10/03/2017.
 */
public class CollaborateurDTO {

    private String matricule;
    private Date date_arrivee;
    private String nom;
    private String prenom;
    private int poleId;
    private boolean dispoTroisMois;
    private List<Integer> technos;
    private List<Integer> langages;
    private List<Integer> outils;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
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

    public int getPoleId() {
        return poleId;
    }

    public void setPoleId(int poleId) {
        this.poleId = poleId;
    }

    public boolean isDispoTroisMois() {
        return dispoTroisMois;
    }

    public void setDispoTroisMois(boolean dispoTroisMois) {
        this.dispoTroisMois = dispoTroisMois;
    }

    public List<Integer> getTechnos() {
        return technos;
    }

    public void setTechnos(List<Integer> technos) {
        this.technos = technos;
    }

    public List<Integer> getLangages() {
        return langages;
    }

    public void setLangages(List<Integer> langages) {
        this.langages = langages;
    }

    public List<Integer> getOutils() {
        return outils;
    }

    public void setOutils(List<Integer> outils) {
        this.outils = outils;
    }
}
