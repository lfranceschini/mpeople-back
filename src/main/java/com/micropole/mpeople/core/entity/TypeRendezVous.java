package com.micropole.mpeople.core.entity;

import javax.persistence.*;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@Entity
@Table(name = "tv_type_rdv")
public class TypeRendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String label;
    @Lob
    private byte[] picto;

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

    public byte[] getPicto() {
        return picto;
    }

    public void setPicto(byte[] picto) {
        this.picto = picto;
    }
}
