package com.example.reto3ciclo3.Controller;

import com.example.reto3ciclo3.Modelo.Category;
import com.example.reto3ciclo3.services.Categoryservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")

public class CategoryController {

    @Autowired
    private Categoryservices categoryService;

    @GetMapping("/all")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category c) {
        return categoryService.save(c);
    }
}
