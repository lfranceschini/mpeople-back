package com.micropole.mpeople.core.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by lfranceschini on 20/03/2017.
 */
@Entity
@Table(name = "rendez_vous")
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "tv_type_rdv_id")
    private TypeRendezVous typeRendezVous;

    @ManyToOne
    @JoinColumn(name = "tv_status_rdv_id")
    private StatusRendezVous statusRendezVous;

    @ManyToOne
    @JoinColumn(name = "tv_client_id")
    private Client client;

    private LocalDateTime date = LocalDateTime.now();

    public RendezVous() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public TypeRendezVous getTypeRendezVous() {
        return typeRendezVous;
    }

    public void setTypeRendezVous(TypeRendezVous typeRendezVous) {
        this.typeRendezVous = typeRendezVous;
    }

    public StatusRendezVous getStatusRendezVous() {
        return statusRendezVous;
    }

    public void setStatusRendezVous(StatusRendezVous statusRendezVous) {
        this.statusRendezVous = statusRendezVous;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
