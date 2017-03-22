package com.micropole.mpeople.core.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by lfranceschini on 08/03/2017.
 */
@Entity
@Table(name = "tv_poste")
public class Poste implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;

    //Relation bidirectionnelle avec l'objet collaborateur
    @OneToMany(mappedBy = "poste")
    @JsonBackReference
    private List<Collaborateur> collaborateurs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Collection<Collaborateur> getCollaborateurs() {
        return collaborateurs;
    }

    public void setCollaborateur(List<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }

    @Override
    public String toString() {
        return "Poste{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", collaborateur=" + collaborateurs +
                '}';
    }
}
