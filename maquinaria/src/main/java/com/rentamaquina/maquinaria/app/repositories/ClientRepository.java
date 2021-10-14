/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;


import com.rentamaquina.maquinaria.app.entities.Client;
import com.rentamaquina.maquinaria.app.repositories.crud.ClientCrudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fdomoreno
 */
@Repository
public class ClientRepository  {
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    
    //Consultar
    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    
}
