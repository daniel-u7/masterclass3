package com.example.reto3ciclo3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name= "message")

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn (name="disfracesid")
    @JsonIgnoreProperties ({"messages","reservations"})
    private Disfraces disfraces;

    @ManyToOne
    @JoinColumn (name="clientid")
    @JsonIgnoreProperties ({"messages","reservations"})
    private Client client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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
}
