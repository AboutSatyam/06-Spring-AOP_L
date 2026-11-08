package com.satyam._6springaop_l.service;

import com.satyam._6springaop_l.model.Alien;

import java.util.List;

public interface IAlienService {

    public Alien registerAlien(Alien alien);
    public List<Alien> getAllAlienInfo();

}
