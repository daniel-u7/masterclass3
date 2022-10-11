package com.example.reto3ciclo3.services;

import com.example.reto3ciclo3.Modelo.Score;

import com.example.reto3ciclo3.Repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class Scoreservices {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll() {
        return scoreRepository
                .getAll();
    }

    public Optional<Score> getProduct(int id) {
        return scoreRepository.getScore(id);
    }

    public Score save(Score p) {
        if (p.getIdScore() == null) {
            return scoreRepository.save(p);
        } else {
            Optional<Score> e = scoreRepository.getScore(p.getIdScore());
            if (e.isPresent()) {
                return p;
            } else {
                return scoreRepository.save(p);
            }
        }
    }

    public Score update(Score p) {
        if (p.getIdScore() != null) {
            Optional<Score> q = scoreRepository.getScore(p.getIdScore());
            if (q.isPresent()) {
                if (p.getIdScore() != null) {
                    q.get().setIdScore(p.getIdScore());
                }

                if (p.getIdScore() != null) {
                    q.get().setIdScore(p.getIdScore());
                }
                if (p.getMessageText() != null) {
                    q.get().setMessageText(p.getMessageText());
                }
                if (p.getStars() != null) {
                    q.get().setStars(p.getStars());
                }
                scoreRepository.save(q.get());
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
        Optional<Score> p = scoreRepository.getScore(id);
        if (p.isPresent()) {
            scoreRepository.delete(p.get());
            flag = true;
        }
        return flag;

    }
}
