/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;

import com.rentamaquina.maquinaria.app.entities.Admin;
import com.rentamaquina.maquinaria.app.repositories.crud.AdminCrudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;
    
    //Consultar
    public List<Admin> getAll(){
        return (List<Admin>) adminCrudRepository.findAll();
    }
}
