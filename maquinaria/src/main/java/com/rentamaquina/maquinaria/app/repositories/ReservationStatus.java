/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentamaquina.maquinaria.app.repositories;

import lombok.Data;

/**
 *
 * @author GETDE
 */
@Data
public class ReservationStatus {
    
    private int completed;
    private int cancelled;
    
    public ReservationStatus(int completed, int cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }
    
}
