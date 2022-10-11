package com.example.reto3ciclo3.Controller;

import com.example.reto3ciclo3.Modelo.Disfraces;
import com.example.reto3ciclo3.services.Disfracesservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Disfraces")

public class DisfracesController {
    @Autowired

        private Disfracesservices disfracesServices;

        @GetMapping("/all")
        public List<Disfraces> getAll(){
            return disfracesServices.getAll();
        }
        @PostMapping("/save")
        @ResponseStatus(HttpStatus.CREATED)
        public Disfraces save(@RequestBody Disfraces c){
            return disfracesServices.save(c);

        }
}
