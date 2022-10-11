package com.example.reto3ciclo3.services;

import com.example.reto3ciclo3.Modelo.Disfraces;
import com.example.reto3ciclo3.Repository.DisfracesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Disfracesservices {

    @Autowired
    private DisfracesRepository disfracesRepository;

    public List<Disfraces> getAll() {
        return disfracesRepository.getAll();
    }

    public Optional<Disfraces> getDisfraces(int id) {
        return disfracesRepository.getDisfraces(id);
    }

    public Disfraces save(Disfraces p) {
        if (p.getId() == null) {
            return disfracesRepository.save(p);
        } else {
            Optional<Disfraces> e = disfracesRepository.getDisfraces(p.getId());
            if (e.isPresent()) {
                return p;
            } else {
                return disfracesRepository.save(p);
            }
        }
    }

    public Disfraces update(Disfraces p) {
        if (p.getId() != null) {
            Optional<Disfraces> q = disfracesRepository.getDisfraces(p.getId());
            if (q.isPresent()) {
                if (p.getName() != null) {
                    q.get().setName(p.getName());
                }
                if (p.getDescripcion() != null) {
                    q.get().setDescripcion(p.getDescripcion());
                }
                if (p.getMarca() != null) {
                    q.get().setMarca(p.getMarca());
                }
                if (p.getCategorías() != null) {
                    q.get().setCategorías(p.getCategorías());
                }

                disfracesRepository.save(q.get());
                return q.get();
            } else {
                return p;
            }
        } else {
            return p;
        }
    }

    public boolean delete(int id) {
        boolean flag = false;
        Optional<Disfraces> p = disfracesRepository.getDisfraces(id);
        if (p.isPresent()) {
            disfracesRepository.delete(p.get());
            flag = true;
        }
        return flag;

    }
}
