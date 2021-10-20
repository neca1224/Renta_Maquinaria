/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;

import com.rentamaquina.maquinaria.app.entities.Score;
import com.rentamaquina.maquinaria.app.repositories.crud.ScoreCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCrudRepository scoreCrudRepository;
    
    /**
     * Select
     * @return 
     */
    public List<Score> getAll(){
        return (List<Score>) scoreCrudRepository.findAll();
    }
    
    /**
     * Insert
     * @param reservation
     * @return 
     */
    public Score save(Score score){
        return scoreCrudRepository.save(score);
    }
    
    /**
     * Buscar registro
     * @param reservationId
     * @return 
     */
    public Optional<Score> getScore(int reservationId){
        return scoreCrudRepository.findById(reservationId);
    }
    
    /**
     * Delete
     * @param reservation 
     */
    public void delete(Score score){
        scoreCrudRepository.delete(score);
    }
    
    
}
