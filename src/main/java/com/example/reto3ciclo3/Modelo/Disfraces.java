package com.example.reto3ciclo3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "disfraces")

public class Disfraces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name ;
    private String marca;
    private Integer year ; // numero entero de 4 digitos
    private String descripcion;

    @ManyToOne
    @JoinColumn(name= "categorysid")
    @JsonIgnoreProperties("disfraces")
    private Category category;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "disfraces")
    @JsonIgnoreProperties({"disfraces","messages"})
    public List<Reservation>reservations;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "disfraces")
    @JsonIgnoreProperties({"disfraces","client"})
    public  List<Message>messages;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Category getCategorías() {
        return category;
    }

    public void setCategorías(Category category) {
        this.category = category;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
