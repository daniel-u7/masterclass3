package com.example.reto3ciclo3.Controller;

import com.example.reto3ciclo3.Modelo.Client;
import com.example.reto3ciclo3.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")

public class ClientController {
    @Autowired

        private ClientService clientService;

        @GetMapping("/all")
        public List<Client> getAll(){
            return clientService.getAll();
        }
        @PostMapping("/save")
        @ResponseStatus(HttpStatus.CREATED)
        public Client save(@RequestBody Client c){
            return clientService.save(c);
        }
        public Object getIdClient() {
            return null;
        }
}
