package com.example.reto3ciclo3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "reservation")


public class Reservation {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;

    private String cliente;
    private Date startDate; //fecha de incio
    private Date devolutionDate;
    private String status ="created";

    @ManyToOne
    @JoinColumn( name="disfracesid")
    @JsonIgnoreProperties("reservations")
    private Disfraces disfraces;

    @ManyToOne
    @JoinColumn( name="client")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;

    @OneToOne
    @JsonIgnoreProperties("reservation")
    private Score score;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Disfraces getDisfraces() {
        return disfraces;
    }

    public void setDisfraces(Disfraces disfraces) {
        this.disfraces = disfraces;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
