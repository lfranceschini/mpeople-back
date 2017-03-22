package com.micropole.mpeople.core.entity;

import javax.persistence.*;

/**
 * Created by lfranceschini on 12/03/2017.
 */
@Entity
@Table(name = "tv_outil")
public class Outil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    private String version;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
