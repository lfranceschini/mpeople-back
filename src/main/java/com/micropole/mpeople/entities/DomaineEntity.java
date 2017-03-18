package com.micropole.mpeople.entities;

import javax.persistence.*;

/**
 * Created by lfranceschini on 14/03/2017.
 */
@Entity
@Table(name = "tv_domaine")
public class DomaineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;

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
}
