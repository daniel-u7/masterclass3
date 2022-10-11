package com.example.reto3ciclo3.Repository;


import com.example.reto3ciclo3.Modelo.Disfraces;
import com.example.reto3ciclo3.Repository.CrudRepository.DisfracesCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class DisfracesRepository {

    @Autowired
    private DisfracesCrudRepository disfracesCrudRepository;
    public List<Disfraces> getAll (){
        return (List<Disfraces>)disfracesCrudRepository.findAll();
    }

    public Optional<Disfraces> getDisfraces(int id){
        return disfracesCrudRepository.findById(id);
    }

    public Disfraces save(Disfraces c){
        return disfracesCrudRepository.save(c);
    }

    public void delete (Disfraces c){
        disfracesCrudRepository.delete(c);
    }
}
