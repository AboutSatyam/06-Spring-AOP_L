package com.satyam._6springaop_l.service;

import com.satyam._6springaop_l.dao.IAlienRepo;
import com.satyam._6springaop_l.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService implements IAlienService {

    @Autowired
    private IAlienRepo repo;

    @Override
    public Alien registerAlien(Alien alien) {
        return repo.save(alien);
    }

    @Override
    public List<Alien> getAllAlienInfo() {
        return repo.findAll();
    }
}
