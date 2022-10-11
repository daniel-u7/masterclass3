package com.example.reto3ciclo3.Controller;


import com.example.reto3ciclo3.Modelo.Score;

import com.example.reto3ciclo3.services.Scoreservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    private Scoreservices scoreservices;

    @GetMapping("/all")
    public List<Score> getAll(){
        return scoreservices.getAll();
    }
    @PostMapping ("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody  Score p){
        return scoreservices.save(p);
    }
}
