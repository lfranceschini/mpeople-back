package com.micropole.mpeople.core.entity;

import javax.persistence.*;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@Entity
@Table(name = "tv_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    @ManyToOne
    @JoinColumn(name = "tv_domaine_id")
    private Domaine domaine;

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

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }
}
