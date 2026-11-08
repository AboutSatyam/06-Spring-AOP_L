package com.satyam._6springaop_l.dao;

import com.satyam._6springaop_l.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlienRepo extends JpaRepository<Alien, Integer> {

}
