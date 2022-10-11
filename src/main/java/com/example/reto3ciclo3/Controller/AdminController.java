package com.example.reto3ciclo3.Controller;

import com.example.reto3ciclo3.Modelo.Admin;
import com.example.reto3ciclo3.services.Adminservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")

public class AdminController {
    @Autowired
    private Adminservices adminservices;
    @GetMapping("/all")
    public List<Admin> getALL() {
        return adminservices.getAll();

    }
    @GetMapping("/(id)")
        public Optional<Admin> getAdmin(@PathVariable("id") int id) {
         return adminservices.getAdmin(id);
    }
     // app/admin/save
     @PostMapping ("/save")
     @ResponseStatus(HttpStatus.CREATED)
     public Admin save(@RequestBody Admin admin){
         return adminservices.save(admin);
    }

    }


