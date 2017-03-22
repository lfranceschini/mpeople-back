package com.micropole.mpeople.core.entity;

import javax.persistence.*;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@Entity
@Table(name = "tv_domaine")
public class Domaine {

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
