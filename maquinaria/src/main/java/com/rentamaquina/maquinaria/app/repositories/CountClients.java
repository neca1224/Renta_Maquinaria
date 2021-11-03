/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;

import com.rentamaquina.maquinaria.app.entities.Client;
import lombok.Data;

/**
 *
 * @author GETDE
 */
@Data
public class CountClients {
    private Long total;
    private Client client;

    public CountClients(Long total, Client client) {
        this.total = total;
        this.client = client;
    }
    
    
}
