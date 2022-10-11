package com.example.reto3ciclo3.Controller;

import com.example.reto3ciclo3.Modelo.Reservation;
import com.example.reto3ciclo3.services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationServices reservationServices;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationServices.getAll();
    }
    @PostMapping ("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody  Reservation p){
        return reservationServices.save(p);
    }
}
